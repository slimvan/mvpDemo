package com.xingyun.mvpdemo.model;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/11.
 * desc:
 */

public class VideoListBean {


    /**
     * error : 0
     * msg : success
     * article_list : [{"article_id":1,"sort_id":4,"title":"1.1.调音台概览 ","sub_title":"","img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233584722304.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/217fce10bb5444d0ae47a98deff55cfa/1.1.%E8%B0%83%E9%9F%B3%E5%8F%B0%E6%A6%82%E8%A7%88_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":2,"sort_id":4,"title":"1.2.Rio概览","sub_title":"","img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523358442451.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/eec619e2c3df4085a367c6e0ab8cd327/1.2.Rio%E6%A6%82%E8%A7%88_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":3,"sort_id":4,"title":"2.1.系统设置概览","sub_title":"","img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233584003997.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/7aa41b6397a441daa197b0eadaa1085e/2.1.%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%E6%A6%82%E8%A7%88.m3u8"},{"article_id":4,"sort_id":4,"title":"2.2.菊型链网络设置","sub_title":"","img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523358347489.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/51f09d984f0e43ce81a1ebed607a0c80/2.2.%E8%8F%8A%E5%9E%8B%E9%93%BE%E7%BD%91%E7%BB%9C%E8%AE%BE%E7%BD%AE.m3u8"},{"article_id":5,"sort_id":4,"title":"2.3.冗余网络设置","sub_title":"","img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233583142740.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/169500e872304baf87806bc320f658fc/2.3.%E5%86%97%E4%BD%99%E7%BD%91%E7%BB%9C%E8%AE%BE%E7%BD%AE.m3u8"},{"article_id":6,"sort_id":4,"title":"2.4.Dante网络初始路由配置","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233582705976.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/b73c7b307ec145c78a28378ed9cf3e87/2.4.Dante%E7%BD%91%E7%BB%9C%E5%88%9D%E5%A7%8B%E8%B7%AF%E7%94%B1%E9%85%8D%E7%BD%AE.m3u8"},{"article_id":7,"sort_id":4,"title":"3.1. 选听、监听、振荡器、对讲 设置","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233582374609.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/1e66ef4b9608479e94343d8981c40b2b/3.1.%20%E9%80%89%E5%90%AC%E3%80%81%E7%9B%91%E5%90%AC%E3%80%81%E6%8C%AF%E8%8D%A1%E5%99%A8%E3%80%81%E5%AF%B9%E8%AE%B2%20%E8%AE%BE%E7%BD%AE_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":8,"sort_id":4,"title":"3.2. 选中通道 以及 8-通道概览","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233582037425.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/d6cd0c434ce3475198bee112ceebb0ce/3.2.%20%E9%80%89%E4%B8%AD%E9%80%9A%E9%81%93%20%E4%BB%A5%E5%8F%8A%208-%E9%80%9A%E9%81%93%E6%A6%82%E8%A7%88_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":9,"sort_id":4,"title":"3.3. 调用场景000、默认输入配线","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233581777249.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/aef131bce296431f8ef095024d07e02a/3.3.%20%E8%B0%83%E7%94%A8%E5%9C%BA%E6%99%AF000%E3%80%81%E9%BB%98%E8%AE%A4%E8%BE%93%E5%85%A5%E9%85%8D%E7%BA%BF_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":10,"sort_id":4,"title":"3.4. 输入通道基础","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233581502546.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/f0e3436cffa34b538483f64cbf875ada/3.4.%20%E8%BE%93%E5%85%A5%E9%80%9A%E9%81%93%E5%9F%BA%E7%A1%80_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":11,"sort_id":4,"title":"3.5. 通道库","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523358118507.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/8c8e32d5013d48a9a9c21ba2e178557f/3.5.%20%E9%80%9A%E9%81%93%E5%BA%93_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":12,"sort_id":4,"title":"3.6. 在混音中添加默认效果","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233580855221.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/2564b968b1c6455bb9577e4225e3c8ee/3.6.%20%E5%9C%A8%E6%B7%B7%E9%9F%B3%E4%B8%AD%E6%B7%BB%E5%8A%A0%E9%BB%98%E8%AE%A4%E6%95%88%E6%9E%9C_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":13,"sort_id":4,"title":"3.7. 将输入通道分配给Mix母线","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233580483674.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/3837eb07733349f395ec21bd839e0b5a/3.7.%20%E5%B0%86%E8%BE%93%E5%85%A5%E9%80%9A%E9%81%93%E5%88%86%E9%85%8D%E7%BB%99Mix%E6%AF%8D%E7%BA%BF_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":14,"sort_id":4,"title":"3.8. 输出母线基础","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233580148924.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/e2fa85d1efb040aba622b0008bd83749/3.8.%20%E8%BE%93%E5%87%BA%E6%AF%8D%E7%BA%BF%E5%9F%BA%E7%A1%80_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":15,"sort_id":4,"title":"3.9. 使用虚拟机架","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233579819618.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/5b5a2a3e788b49b1b28ebf8050367590/3.9.%20%E4%BD%BF%E7%94%A8%E8%99%9A%E6%8B%9F%E6%9C%BA%E6%9E%B6_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":16,"sort_id":4,"title":"3.10. 场景基础","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233579281771.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/d0a5155cc71d494bbd15308063d328ed/3.10.%20%E5%9C%BA%E6%99%AF%E5%9F%BA%E7%A1%80_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":17,"sort_id":4,"title":"3.11. 撤销保存与撤销调用","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523357887718.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/3e291bfb21204da095e85a000a34999b/3.11.%20%E6%92%A4%E9%94%80%E4%BF%9D%E5%AD%98%E4%B8%8E%E6%92%A4%E9%94%80%E8%B0%83%E7%94%A8_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":18,"sort_id":4,"title":"3.12. 保存与载入调音台文件","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233578231486.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/fe4fe441e08e4a7ab4468f399acea03c/3.12.%20%E4%BF%9D%E5%AD%98%E4%B8%8E%E8%BD%BD%E5%85%A5%E8%B0%83%E9%9F%B3%E5%8F%B0%E6%96%87%E4%BB%B6_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":19,"sort_id":4,"title":"3.13. 录音基础：两轨和多轨录音","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233577882197.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/cd1adeb0be3c4aaa9691ebd943ec05e7/3.13.%20%E5%BD%95%E9%9F%B3%E5%9F%BA%E7%A1%80%EF%BC%9A%E4%B8%A4%E8%BD%A8%E5%92%8C%E5%A4%9A%E8%BD%A8%E5%BD%95%E9%9F%B3_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":20,"sort_id":4,"title":"3.14. 使用CL Editor","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233577381842.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/f48db900abeb41ce876dc58eee08a9bf/3.14.%20%E4%BD%BF%E7%94%A8CL%20Editor_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":21,"sort_id":4,"title":"3.15. 使用CL StageMix","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233576982267.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/fdacae2b2c544d799372ffa8c601f86e/3.15.%20%E4%BD%BF%E7%94%A8CL%20StageMix_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":22,"sort_id":4,"title":"4.1. 进阶 Dante 网络设置","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233576602314.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/2b440021349e4aa8aba0ac6b093e16dd/4.1.%20%E8%BF%9B%E9%98%B6%20Dante%20%E7%BD%91%E7%BB%9C%E8%AE%BE%E7%BD%AE_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":23,"sort_id":4,"title":"4.2. 复合调音台系统","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523357583137.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/edf6e2fff35241388e3503b3dc7ded5b/4.2.%20%E5%A4%8D%E5%90%88%E8%B0%83%E9%9F%B3%E5%8F%B0%E7%B3%BB%E7%BB%9F_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":24,"sort_id":4,"title":"4.3. 用户偏好设置","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233575289850.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/7e4b039ec40f472790d3f60989b63155/4.3.%20%E7%94%A8%E6%88%B7%E5%81%8F%E5%A5%BD%E8%AE%BE%E7%BD%AE_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":25,"sort_id":4,"title":"4.4. 系统设置","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233574901328.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/de09ae0596a142ff91e6a44cb898f2a8/4.4.%20%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":26,"sort_id":4,"title":"4.5. 输入通道操作（进阶）","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233574565408.png","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/b8312526229c4a4b8f987b9c2f74b99e/4.5.%20%E8%BE%93%E5%85%A5%E9%80%9A%E9%81%93%E6%93%8D%E4%BD%9C%EF%BC%88%E8%BF%9B%E9%98%B6%EF%BC%89_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":27,"sort_id":4,"title":"4.6. 输出通道操作（进阶）","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233574238462.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/096b739cbd214e8b85795b3fabd71b3f/4.6.%20%E8%BE%93%E5%87%BA%E9%80%9A%E9%81%93%E6%93%8D%E4%BD%9C%EF%BC%88%E8%BF%9B%E9%98%B6%EF%BC%89_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":28,"sort_id":4,"title":"4.7. 调用安全，调用聚焦以及全局黏贴","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233573899025.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/1ea66a7d18904366a01dcf3cdbea9696/4.7.%20%E8%B0%83%E7%94%A8%E5%AE%89%E5%85%A8%EF%BC%8C%E8%B0%83%E7%94%A8%E8%81%9A%E7%84%A6%E4%BB%A5%E5%8F%8A%E5%85%A8%E5%B1%80%E9%BB%8F%E8%B4%B4_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"},{"article_id":29,"sort_id":4,"title":"4.8. 用户级管理","sub_title":null,"img":"http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/1523357359255.jpg","video_url":"https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/b577bb682d4941018e814d499947d84a/4.8.%20%E7%94%A8%E6%88%B7%E7%BA%A7%E7%AE%A1%E7%90%86_H264%E9%AB%98%E6%B8%85_1280x720.m3u8"}]
     * sort_title : CL系列 在线培训
     */

    private int error;
    private String msg;
    private String sort_title;
    private List<ArticleListBean> article_list;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSort_title() {
        return sort_title;
    }

    public void setSort_title(String sort_title) {
        this.sort_title = sort_title;
    }

    public List<ArticleListBean> getArticle_list() {
        return article_list;
    }

    public void setArticle_list(List<ArticleListBean> article_list) {
        this.article_list = article_list;
    }

    public static class ArticleListBean {
        /**
         * article_id : 1
         * sort_id : 4
         * title : 1.1.调音台概览
         * sub_title :
         * img : http://yamaha-pa.oss-cn-shenzhen.aliyuncs.com/upload/image/20180410/15233584722304.jpg
         * video_url : https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/217fce10bb5444d0ae47a98deff55cfa/1.1.%E8%B0%83%E9%9F%B3%E5%8F%B0%E6%A6%82%E8%A7%88_H264%E9%AB%98%E6%B8%85_1280x720.m3u8
         */

        private int article_id;
        private int sort_id;
        private String title;
        private String sub_title;
        private String img;
        private String video_url;

        public int getArticle_id() {
            return article_id;
        }

        public void setArticle_id(int article_id) {
            this.article_id = article_id;
        }

        public int getSort_id() {
            return sort_id;
        }

        public void setSort_id(int sort_id) {
            this.sort_id = sort_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }
    }
}
