package com.xingyun.mvpdemo.http;

import com.xingyun.mvpdemo.model.MusicDetailBean;
import com.xingyun.mvpdemo.model.MusicListBean;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/12.
 * desc: 百度音乐api
 */

public interface BaiduMusicApi {

    /**
     * 歌曲排行榜列表
     *
     * @param method 接口定义
     * @param type   排行榜类型
     * @param offset 偏移量
     * @param size   获取的条目数量
     * @return
     */
    @GET("restserver/ting")
    @Headers("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 360SE)")  //加上User-Agent才可以调用接口，否则会报http403
    Observable<MusicListBean> musicList(@Query("method") String method,
                                        @Query("type") String type,
                                        @Query("offset") String offset,
                                        @Query("size") String size);

    /**
     * 歌曲信息
     *
     * @param method 接口定义
     * @param songid 歌曲id
     * @return
     */
    @GET("restserver/ting")
    @Headers("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 360SE)") //加上User-Agent才可以调用接口，否则会报http403
    Observable<MusicDetailBean> musicDetail(@Query("method") String method,
                                            @Query("songid") String songid);
}
