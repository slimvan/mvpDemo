package com.xingyun.mvpdemo.http;

import com.xingyun.mvpdemo.model.VideoListBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/11.
 * desc:
 */

public interface YamahaApi {

    @GET("article/list")
    Observable<VideoListBean> videoList(@Query("sort_id") String sort_id);
}
