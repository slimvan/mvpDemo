package com.xingyun.mvpdemo.model;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/2/2.
 * desc:
 */

public class AttendForumBean {

    /**
     * attendStatus : 0
     * forumInfo : {"fid":"1048","name":"湿乎乎的话题","logo":"http://i2.hoopchina.com.cn//blogfile/201510/12/BbsImg144462016469330_110*88.png","description":"工业时代是干巴巴的，我们在虚拟世界的关系是湿乎乎的。每一个话题，都会让我们更多一些交集，更多一些黏着力O(∩_∩)O~","forumtag":"","vieworder":"0","user_password":0,"count":"34349","backImg":"http://i1.hoopchina.com.cn/blogfile/201512/29/BbsImg145138210052815_990*686.jpg","back_img_url":"","is_skip":"0","skip_url":"","skip_content":"","digest":0}
     * status : 200
     */

    private int attendStatus;
    private ForumInfoBean forumInfo;
    private int status;

    public int getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(int attendStatus) {
        this.attendStatus = attendStatus;
    }

    public ForumInfoBean getForumInfo() {
        return forumInfo;
    }

    public void setForumInfo(ForumInfoBean forumInfo) {
        this.forumInfo = forumInfo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class ForumInfoBean {
        /**
         * fid : 1048
         * name : 湿乎乎的话题
         * logo : http://i2.hoopchina.com.cn//blogfile/201510/12/BbsImg144462016469330_110*88.png
         * description : 工业时代是干巴巴的，我们在虚拟世界的关系是湿乎乎的。每一个话题，都会让我们更多一些交集，更多一些黏着力O(∩_∩)O~
         * forumtag :
         * vieworder : 0
         * user_password : 0
         * count : 34349
         * backImg : http://i1.hoopchina.com.cn/blogfile/201512/29/BbsImg145138210052815_990*686.jpg
         * back_img_url :
         * is_skip : 0
         * skip_url :
         * skip_content :
         * digest : 0
         */

        private String fid;
        private String name;
        private String logo;
        private String description;
        private String forumtag;
        private String vieworder;
        private int user_password;
        private String count;
        private String backImg;
        private String back_img_url;
        private String is_skip;
        private String skip_url;
        private String skip_content;
        private int digest;

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getForumtag() {
            return forumtag;
        }

        public void setForumtag(String forumtag) {
            this.forumtag = forumtag;
        }

        public String getVieworder() {
            return vieworder;
        }

        public void setVieworder(String vieworder) {
            this.vieworder = vieworder;
        }

        public int getUser_password() {
            return user_password;
        }

        public void setUser_password(int user_password) {
            this.user_password = user_password;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getBackImg() {
            return backImg;
        }

        public void setBackImg(String backImg) {
            this.backImg = backImg;
        }

        public String getBack_img_url() {
            return back_img_url;
        }

        public void setBack_img_url(String back_img_url) {
            this.back_img_url = back_img_url;
        }

        public String getIs_skip() {
            return is_skip;
        }

        public void setIs_skip(String is_skip) {
            this.is_skip = is_skip;
        }

        public String getSkip_url() {
            return skip_url;
        }

        public void setSkip_url(String skip_url) {
            this.skip_url = skip_url;
        }

        public String getSkip_content() {
            return skip_content;
        }

        public void setSkip_content(String skip_content) {
            this.skip_content = skip_content;
        }

        public int getDigest() {
            return digest;
        }

        public void setDigest(int digest) {
            this.digest = digest;
        }
    }
}
