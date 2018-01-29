package com.xingyun.mvpdemo.model;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class MovieDetailBean {

    /**
     * rating : {"max":10,"average":7.5,"stars":"40","min":0}
     * reviews_count : 5743
     * wish_count : 35972
     * douban_site : https://site.douban.com/134767/
     * year : 2018
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg"}
     * alt : https://movie.douban.com/subject/6874741/
     * id : 6874741
     * mobile_url : https://movie.douban.com/subject/6874741/mobile
     * title : 无问西东
     * do_count : null
     * share_url : https://m.douban.com/movie/subject/6874741
     * seasons_count : null
     * schedule_url : https://movie.douban.com/subject/6874741/cinema/
     * episodes_count : null
     * countries : ["中国大陆"]
     * genres : ["剧情","爱情","战争"]
     * collect_count : 157523
     * casts : [{"alt":"https://movie.douban.com/celebrity/1041014/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg"},"name":"章子怡","id":"1041014"},{"alt":"https://movie.douban.com/celebrity/1041404/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg"},"name":"黄晓明","id":"1041404"},{"alt":"https://movie.douban.com/celebrity/1077991/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg"},"name":"张震","id":"1077991"},{"alt":"https://movie.douban.com/celebrity/1045243/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21771.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21771.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21771.jpg"},"name":"王力宏","id":"1045243"}]
     * current_season : null
     * original_title : 无问西东
     * summary : 如果提前了解了你所要面对的人生，你是否还会有勇气前来？吴岭澜、沈光耀、王敏佳、陈鹏、张果果，几个年轻人满怀诸多渴望，在四个非同凡响的时空中一路前行。
     吴岭澜（陈楚生 饰），出发时意气风发，却很快在途中迷失了方向。沈光耀（王力宏 饰），自愿参与了最残酷的战争，他一直在努力去做那些令他害怕，但重要的事。王敏佳（章子怡 饰）最初的错误，只是为了虚荣撒了一个小谎；最初的烦恼，只是在两个优秀的男人中选择一个。但命运，却把她拖入被众人唾骂的深渊。陈鹏（黄晓明 饰）把爱情摆在了理想前面，但爱情却没有把他摆在前面。他说，“我有人要照顾”，纵然这意味着与所有人作对，意味着要和她一起被放逐千里。张果果（张震 饰），身处尔虞我诈的职场，“赢”是他的习惯。为了赢，他总是见招拆招，先发制人。而有一天，他却面临了一个比“赢”更重要的选择。这几个年轻人，在最好的年纪迎来了最残酷的考验,并成就了永不褪色的青春传奇。
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1313682/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg"},"name":"李芳芳","id":"1313682"}]
     * comments_count : 77940
     * ratings_count : 152375
     * aka : ["Forever Young"]
     */

    private RatingBean rating;
    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<DirectorsBean> directors;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 7.5
         * stars : 40
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1041014/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg"}
         * name : 章子怡
         * id : 1041014
         */

        private String alt;
        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1313682/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg"}
         * name : 李芳芳
         * id : 1313682
         */

        private String alt;
        private AvatarsBeanX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
