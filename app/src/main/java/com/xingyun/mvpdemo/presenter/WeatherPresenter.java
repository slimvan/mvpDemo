package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.WeatherContract;
import com.xingyun.mvpdemo.http.WeatherApi;
import com.xingyun.mvpdemo.model.WeatherBean;
import com.xingyun.slimvan.http.HttpConfig;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;
import com.xingyun.slimvan.util.TimeUtils;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import sun.misc.BASE64Encoder;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/13.
 * desc:
 */

public class WeatherPresenter extends BasePresenter<WeatherContract.View> implements WeatherContract.Presenter {
    private Context mContext;

    public WeatherPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void requestWeatherNow() {
        try {
            HashMap<String, String> map = new HashMap<>();
            map.put("location", "auto_ip");
            map.put("username", Constants.HEFENG_USER_NAME);
            map.put("t", TimeUtils.millis2String(TimeUtils.getNowMills()));
            String signature = getSignature(map, Constants.HEFENG_SECREAT_KEY);
            RetrofitBuilder.build(WeatherApi.class, HttpConfig.HEFENG_WEATHER_URL)
                    .weatherNow("auto_ip",
                            Constants.HEFENG_USER_NAME,
                            TimeUtils.millis2String(TimeUtils.getNowMills()),
                            signature)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new MSubscriber<WeatherBean>(mContext, true, true) {
                        @Override
                        public void onSuccess(WeatherBean weatherBean) {
                            if (weatherBean != null) {
                                getView().onLoadSuccess(weatherBean);
                            }
                        }

                        @Override
                        public void errorCallBack(Throwable e) {
                            getView().onLoadFail();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 和风天气签名生成算法-JAVA版本
     *
     * @return 签名
     * @throws IOException
     */
    public static String getSignature(HashMap<String, String> params, String secret) throws IOException {
        // 先将参数以其参数名的字典序升序进行排序
        Map<String, String> sortedParams = new TreeMap<>(params);
        Set<Map.Entry<String, String>> entrys = sortedParams.entrySet();

        // 遍历排序后的字典，将所有参数按"key=value"格式拼接在一起

        StringBuilder baseString = new StringBuilder();
        for (Map.Entry<String, String> param : entrys) {
            //sign参数 和 空值参数 不加入算法
            if (param.getValue() != null && !"".equals(param.getKey().trim()) && !"sign".equals(param.getKey().trim()) && !"key".equals(param.getKey().trim()) && !"".equals(param.getValue().trim())) {
                baseString.append(param.getKey().trim()).append("=").append(param.getValue().trim()).append("&");
            }
        }
        if (baseString.length() > 0) {
            baseString.deleteCharAt(baseString.length() - 1).append(secret);
        }

        // 使用MD5对待签名串求签
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(baseString.toString().getBytes("UTF-8"));
            return new BASE64Encoder().encode(bytes);
        } catch (GeneralSecurityException ex) {
            throw new IOException(ex);
        }
    }
}
