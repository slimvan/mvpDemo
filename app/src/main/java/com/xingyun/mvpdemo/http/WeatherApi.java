package com.xingyun.mvpdemo.http;

import com.xingyun.mvpdemo.model.WeatherBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/13.
 * desc: 和风天气api
 */

public interface WeatherApi {
    @GET("weather/now")
    Observable<WeatherBean> weatherNow(@Query("location") String location,
                                       @Query("username") String username,
                                       @Query("t") String timestamp,
                                       @Query("sign") String sign);
}
