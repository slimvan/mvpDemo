package com.xingyun.mvpdemo.http;

import com.xingyun.mvpdemo.model.BookDetailBean;
import com.xingyun.mvpdemo.model.BookList;
import com.xingyun.mvpdemo.model.HotMovieList;
import com.xingyun.mvpdemo.model.MovieDetailBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/23.
 * desc:
 */

public interface DoubanApi {

    /**
     * 热映电影
     *
     * @param city 城市中文名或id
     * @return
     */
    @GET("movie/in_theaters")
    Observable<HotMovieList> movieListHot(@Query("city") String city);

    /**
     * 即将上映
     *
     * @param start
     * @param count
     * @return
     */
    @GET("movie/coming_soon")
    Observable<HotMovieList> movieListCommingSoon(@Query("start") int start, @Query("count") int count);


    /**
     * 电影Top250
     *
     * @param start
     * @param count
     * @return
     */
    @GET("movie/top250")
    Observable<HotMovieList> movieListTop250(@Query("start") int start, @Query("count") int count);


    /**
     * 电影详情
     *
     * @param id
     * @return
     */
    @GET("movie/subject/{id}")
    Observable<MovieDetailBean> movieDetail(@Path("id") String id);


    /**
     * 图书列表
     *
     * @param tag   标签
     * @param start 取结果的offset
     * @param count 取结果的条数
     * @return
     */
    @GET("book/search")
    Observable<BookList> bookList(@Query("tag") String tag, @Query("start") int start, @Query("count") int count);

    /**
     * 书籍详情
     *
     * @param id
     * @return
     */
    @GET("book/{id}")
    Observable<BookDetailBean> bookDetail(@Path("id") String id);
}
