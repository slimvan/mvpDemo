package com.xingyun.mvpdemo.model;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/2/2.
 * desc:
 */

public class ForumContentBean {

    /**
     * pageSize : 19
     * page : 1
     * client : af8a0ff4a546bde
     * isCollected : 0
     * tid : 21340323
     * nps : 89
     * lights : 22
     * userName : 季后赛大基本功
     * replies : 378
     * puid : 28283620
     * forum_name : 路人王专区
     * forum_logo : http://i2.hoopchina.com.cn//blogfile/201706/27/BbsImg149857439834980_5826952679807_110x88.png
     * url : http://bbs.mobileapi.hupu.com/1/7.0.8/threads/getThreadDetailInfoH5?tid=21340323&postAuthorPuid=0&pid=0&page=1&fid=4680&client=af8a0ff4a546bde&night=0&nopic=1&ft=&entrance=&hits=45574&sign=3462ad80f3f3cfac5fe66358bfc9bc26
     * check_reply_url : https://bbs.mobileapi.hupu.com/1/7.0.8/threads/getCheckReplyH5
     * share : {"wechat_moments":"SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家","qzone":"SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家   https://bbs.hupu.com/21340323.html","weibo":"SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家   https://bbs.hupu.com/21340323.html","wechat":"SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家","qq":"SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家","img":"","url":"https://bbs.hupu.com/21340323.html","summary":"虎扑的这篇文章已经引发热烈讨论，赶快来看看吧。"}
     * authorPuid : 28283620
     * fid : 4680
     * isrec : 0
     * recommend_num : 89
     * title : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家
     * domain_list : ["hoopchina.com.cn","hupu.com","shihuo.cn"]
     */

    private int pageSize;
    private String page;
    private String client;
    private int isCollected;
    private String tid;
    private int nps;
    private int lights;
    private String userName;
    private String replies;
    private String puid;
    private String forum_name;
    private String forum_logo;
    private String url;
    private String check_reply_url;
    private ShareBean share;
    private String authorPuid;
    private String fid;
    private int isrec;
    private int recommend_num;
    private String title;
    private List<String> domain_list;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getIsCollected() {
        return isCollected;
    }

    public void setIsCollected(int isCollected) {
        this.isCollected = isCollected;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getNps() {
        return nps;
    }

    public void setNps(int nps) {
        this.nps = nps;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReplies() {
        return replies;
    }

    public void setReplies(String replies) {
        this.replies = replies;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public String getForum_name() {
        return forum_name;
    }

    public void setForum_name(String forum_name) {
        this.forum_name = forum_name;
    }

    public String getForum_logo() {
        return forum_logo;
    }

    public void setForum_logo(String forum_logo) {
        this.forum_logo = forum_logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCheck_reply_url() {
        return check_reply_url;
    }

    public void setCheck_reply_url(String check_reply_url) {
        this.check_reply_url = check_reply_url;
    }

    public ShareBean getShare() {
        return share;
    }

    public void setShare(ShareBean share) {
        this.share = share;
    }

    public String getAuthorPuid() {
        return authorPuid;
    }

    public void setAuthorPuid(String authorPuid) {
        this.authorPuid = authorPuid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public int getIsrec() {
        return isrec;
    }

    public void setIsrec(int isrec) {
        this.isrec = isrec;
    }

    public int getRecommend_num() {
        return recommend_num;
    }

    public void setRecommend_num(int recommend_num) {
        this.recommend_num = recommend_num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDomain_list() {
        return domain_list;
    }

    public void setDomain_list(List<String> domain_list) {
        this.domain_list = domain_list;
    }

    public static class ShareBean {
        /**
         * wechat_moments : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家
         * qzone : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家   https://bbs.hupu.com/21340323.html
         * weibo : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家   https://bbs.hupu.com/21340323.html
         * wechat : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家
         * qq : SOMA步之谜。不争吵，好好说，我给大家去求证了，问了最权威的专家
         * img :
         * url : https://bbs.hupu.com/21340323.html
         * summary : 虎扑的这篇文章已经引发热烈讨论，赶快来看看吧。
         */

        private String wechat_moments;
        private String qzone;
        private String weibo;
        private String wechat;
        private String qq;
        private String img;
        private String url;
        private String summary;

        public String getWechat_moments() {
            return wechat_moments;
        }

        public void setWechat_moments(String wechat_moments) {
            this.wechat_moments = wechat_moments;
        }

        public String getQzone() {
            return qzone;
        }

        public void setQzone(String qzone) {
            this.qzone = qzone;
        }

        public String getWeibo() {
            return weibo;
        }

        public void setWeibo(String weibo) {
            this.weibo = weibo;
        }

        public String getWechat() {
            return wechat;
        }

        public void setWechat(String wechat) {
            this.wechat = wechat;
        }

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }
    }
}
