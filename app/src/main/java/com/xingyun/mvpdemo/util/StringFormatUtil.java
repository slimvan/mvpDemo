package com.xingyun.mvpdemo.util;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.HotMovieList;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class StringFormatUtil {


    /**
     * 格式化输出导演字符串
     *
     * @param directors
     * @return
     */
    public static String formatDirectors(List<HotMovieList.SubjectsBean.DirectorsBean> directors) {
        StringBuilder sbDirector = new StringBuilder();
        if (directors != null && directors.size() > 0) {
            for (int i = 0; i < directors.size(); i++) {
                HotMovieList.SubjectsBean.DirectorsBean directorsBean = directors.get(i);
                if (directorsBean != null) {
                    String name = directorsBean.getName();
                    sbDirector.append(name);
                    if (i < directors.size() - 1) {
                        sbDirector.append("/");
                    }
                }
            }
        }
        return sbDirector.toString();
    }

    /**
     * 格式化输出主演字符串
     *
     * @param casts
     * @return
     */
    public static String formatStarrings(List<HotMovieList.SubjectsBean.CastsBean> casts) {
        StringBuilder sbCasts = new StringBuilder();
        if (casts != null && casts.size() > 0) {
            for (int i = 0; i < casts.size(); i++) {
                HotMovieList.SubjectsBean.CastsBean castsBean = casts.get(i);
                if (castsBean != null) {
                    String name = castsBean.getName();
                    sbCasts.append(name);
                    if (i < casts.size() - 1) {
                        sbCasts.append("/");
                    }
                }
            }
        }
        return sbCasts.toString();
    }

    /**
     * 格式化输出其他字符串类型集合
     *
     * @param strings
     * @return
     */
    public static String formatStringList(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strings != null && strings.size() > 0) {
            for (int i = 0; i < strings.size(); i++) {
                String str = strings.get(i);
                stringBuilder.append(str);
                if (i < strings.size() - 1) {
                    stringBuilder.append("/");
                }
            }
        }
        return stringBuilder.toString();
    }
}
