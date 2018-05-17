package com.xingyun.mvpdemo.presenter;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.ForumDetailContract;
import com.xingyun.mvpdemo.http.HupuApi;
import com.xingyun.mvpdemo.model.AttendForumBean;
import com.xingyun.mvpdemo.model.BBSListBean;
import com.xingyun.mvpdemo.model.ForumContentBean;
import com.xingyun.slimvan.http.HttpConfig;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;
import com.xingyun.slimvan.http.ThreeDESUtil;
import com.xingyun.slimvan.util.DeviceUtils;

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
 * date 2018/2/2.
 * desc:
 */

public class ForumDetailPresenter extends BasePresenter<ForumDetailContract.View> implements ForumDetailContract.Presenter {
    private Context mContext;

    public ForumDetailPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void loadData(String fid, String lastTid, String lastTamp,
                         String type) {
        Map<String, String> params = new HashMap<>();
        params.put("client", DeviceUtils.getAndroidID());
        params.put("night", "0");
        params.put("fid", fid);
        params.put("lastTid", lastTid);
        params.put("isHome", "1");
        params.put("stamp", lastTamp);
        params.put("password", "0");
        params.put("special", "0");
        params.put("type", type);
        String sign = getRequestSign(params);
        RetrofitBuilder.build(HupuApi.class, HttpConfig.HUPU_URL)
                .getBBSList(sign, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<String>(mContext, false, false) {
                    @Override
                    public void onSuccess(String str) {
                        String desStr = ThreeDESUtil.decodeUnicode(str);
                        BBSListBean bbsListBean = new Gson().fromJson(desStr, BBSListBean.class);
                        getView().onLoadSuccess(bbsListBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadFail();
                    }
                });
    }

    /**
     * 获取帖子详情
     *
     * @param tid  帖子id
     * @param fid  论坛id
     * @param page 页数
     * @param pid  回复id
     */
    public void skip2Content(String fid, String tid, String pid, String page) {
        Map<String, String> params = new HashMap<>();
        params.put("client", DeviceUtils.getAndroidID());
        params.put("night", "0");
        if (!TextUtils.isEmpty(tid)) {
            params.put("tid", tid);
        }
        if (!TextUtils.isEmpty(fid)) {
            params.put("fid", fid);
        }

        params.put("page", page);

        if (!TextUtils.isEmpty(pid)) {
            params.put("pid", pid);
        }

        params.put("nopic", "1"); //无图

        String sign = getRequestSign(params);
        RetrofitBuilder.build(HupuApi.class, HttpConfig.HUPU_URL)
                .getBBSSchemaInfo(sign, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<String>(mContext, true, true) {
                    @Override
                    public void onSuccess(String str) {
                        String desStr = ThreeDESUtil.decodeUnicode(str);
                        ForumContentBean forumContentBean = new Gson().fromJson(desStr,ForumContentBean.class);
                        getView().onLoadContent(forumContentBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {

                    }
                });
    }

    /**
     * 获取关注状态
     */
    public void getAttendStatus(String fid,String uid) {
        Map<String, String> params = new HashMap<>();
        params.put("client", DeviceUtils.getAndroidID());
        params.put("night", "0");
        params.put("fid",fid);
        params.put("uid",uid);
        String sign = getRequestSign(params);
        RetrofitBuilder.build(HupuApi.class, HttpConfig.HUPU_URL)
                .getAttentionStatus(sign, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<String>(mContext, false, false) {
                    @Override
                    public void onSuccess(String str) {
                        String desStr = ThreeDESUtil.decodeUnicode(str);
                        AttendForumBean attendForumBean = new Gson().fromJson(desStr, AttendForumBean.class);
                        getView().onLoadAttendInfo(attendForumBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {

                    }
                });
    }

    @Override
    public void loadMore(String fid, String lastTid, String lastTamp, String type) {
        Map<String, String> params = new HashMap<>();
        params.put("client", DeviceUtils.getAndroidID());
        params.put("night", "0");
        params.put("fid", fid);
        params.put("lastTid", lastTid);
        params.put("isHome", "1");
        params.put("stamp", lastTamp);
        params.put("password", "0");
        params.put("special", "0");
        params.put("type", type);
        String sign = getRequestSign(params);
        RetrofitBuilder.build(HupuApi.class, HttpConfig.HUPU_URL)
                .getBBSList(sign, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<String>(mContext, false, true) {
                    @Override
                    public void onSuccess(String str) {
                        String desStr = ThreeDESUtil.decodeUnicode(str);
                        BBSListBean bbsListBean = new Gson().fromJson(desStr, BBSListBean.class);
                        getView().onLoadMoreSuccess(bbsListBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadMoreFail();
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
