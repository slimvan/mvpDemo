package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.google.gson.Gson;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.ForumListContract;
import com.xingyun.mvpdemo.http.HupuApi;
import com.xingyun.mvpdemo.model.ForumListBean;
import com.xingyun.slimvan.http.HttpConfig;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;
import com.xingyun.slimvan.http.ThreeDESUtil;
import com.xingyun.slimvan.util.DeviceUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/30.
 * desc:
 */

public class ForumListPresenter extends BasePresenter<ForumListContract.View> implements ForumListContract.Presenter {
    private Context mContext;

    public ForumListPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void initData() throws UnsupportedEncodingException {
        Map<String, String> params = new HashMap<>();
        params.put("client", DeviceUtils.getAndroidID());
        params.put("night", "0");
        String sign = getRequestSign(params);
        RetrofitBuilder.build(HupuApi.class, HttpConfig.HUPU_URL)
                .forumList(sign, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<String>(mContext, true, true) {
                    @Override
                    public void onSuccess(String str) {
                        String desStr = ThreeDESUtil.decodeUnicode(str);
                        ForumListBean forumListBean = new Gson().fromJson(desStr, ForumListBean.class);
                        getView().onLoadSuccess(forumListBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadFail();
                    }
                });
    }

    public String getRequestSign(Map<String, String> map) {
        ArrayList<Map.Entry<String, String>> list =
                new ArrayList<Map.Entry<String, String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> lhs, Map.Entry<String, String> rhs) {
                return lhs.getKey().compareTo(rhs.getKey());
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i = i + 1) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            Map.Entry<String, String> map1 = list.get(i);
            builder.append(map1.getKey()).append("=").append(map1.getValue());
        }
        builder.append(Constants.HUPU_SIGN);
        return getMD5(builder.toString());
    }

    /**
     * 使用MD5算法对传入的key进行加密并返回。
     */
    public static String getMD5(String key) {
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
