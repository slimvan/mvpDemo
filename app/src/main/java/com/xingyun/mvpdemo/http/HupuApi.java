package com.xingyun.mvpdemo.http;

import com.xingyun.mvpdemo.model.HotMovieList;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/30.
 * desc:
 */

public interface HupuApi {

    @GET("forums/getForums")
    Observable<String> forumList(@Query("sign") String sign, @QueryMap Map<String, String> params);

    @GET("forums/getForumsInfoList")
    Observable<String> getBBSList(@Query("sign") String sign, @QueryMap Map<String, String> params);

    @GET("threads/getThreadsSchemaInfo")
    Observable<String> getBBSSchemaInfo(@Query("sign") String sign, @QueryMap Map<String, String> params);

    @GET("forums/getForumsAttendStatus")
    Observable<String> getAttentionStatus(@Query("sign") String sign, @QueryMap Map<String, String> params);
}
