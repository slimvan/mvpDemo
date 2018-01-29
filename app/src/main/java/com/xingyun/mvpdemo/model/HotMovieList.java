package com.xingyun.mvpdemo.model;

import java.io.Serializable;
import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/23.
 * desc: 图书列表实体类
 */

public class HotMovieList implements Serializable{

    /**
     * count : 20
     * start : 0
     * total : 31
     * subjects : [{"rating":{"max":10,"average":7.5,"stars":"40","min":0},"genres":["剧情","爱情","战争"],"title":"无问西东","casts":[{"alt":"https://movie.douban.com/celebrity/1041014/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg"},"name":"章子怡","id":"1041014"},{"alt":"https://movie.douban.com/celebrity/1041404/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg"},"name":"黄晓明","id":"1041404"},{"alt":"https://movie.douban.com/celebrity/1077991/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg"},"name":"张震","id":"1077991"}],"collect_count":152742,"original_title":"无问西东","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1313682/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg"},"name":"李芳芳","id":"1313682"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg"},"alt":"https://movie.douban.com/subject/6874741/","id":"6874741"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","爱情","冒险"],"title":"敦煌不了情","casts":[{"alt":"https://movie.douban.com/celebrity/1274606/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381813996.22.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381813996.22.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381813996.22.jpg"},"name":"林保怡","id":"1274606"},{"alt":"https://movie.douban.com/celebrity/1342368/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1414312569.2.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1414312569.2.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1414312569.2.jpg"},"name":"梦丽","id":"1342368"},{"alt":"https://movie.douban.com/celebrity/1274972/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381557337.34.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381557337.34.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381557337.34.jpg"},"name":"曹操","id":"1274972"}],"collect_count":80,"original_title":"敦煌不了情","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1383161/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512825862.65.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512825862.65.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512825862.65.jpg"},"name":"郭宜林","id":"1383161"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2502988698.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2502988698.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2502988698.jpg"},"alt":"https://movie.douban.com/subject/27179424/","id":"27179424"},{"rating":{"max":10,"average":8.1,"stars":"40","min":0},"genres":["剧情","音乐"],"title":"神秘巨星","casts":[{"alt":"https://movie.douban.com/celebrity/1373292/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494080264.12.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494080264.12.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494080264.12.jpg"},"name":"塞伊拉·沃西","id":"1373292"},{"alt":"https://movie.douban.com/celebrity/1383897/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510229457.27.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510229457.27.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510229457.27.jpg"},"name":"梅·维贾","id":"1383897"},{"alt":"https://movie.douban.com/celebrity/1031931/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13628.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13628.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13628.jpg"},"name":"阿米尔·汗","id":"1031931"}],"collect_count":53580,"original_title":"Secret Superstar","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1379532/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509423054.09.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509423054.09.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509423054.09.jpg"},"name":"阿德瓦·香登","id":"1379532"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508925590.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508925590.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508925590.jpg"},"alt":"https://movie.douban.com/subject/26942674/","id":"26942674"},{"rating":{"max":10,"average":8.6,"stars":"45","min":0},"genres":["剧情","儿童","家庭"],"title":"奇迹男孩","casts":[{"alt":"https://movie.douban.com/celebrity/1332866/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1456737567.18.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1456737567.18.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1456737567.18.jpg"},"name":"雅各布·特伦布莱","id":"1332866"},{"alt":"https://movie.douban.com/celebrity/1054532/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p8889.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p8889.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p8889.jpg"},"name":"朱莉娅·罗伯茨","id":"1054532"},{"alt":"https://movie.douban.com/celebrity/1335870/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1383535512.2.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1383535512.2.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1383535512.2.jpg"},"name":"伊扎贝拉·维多维奇","id":"1335870"}],"collect_count":34057,"original_title":"Wonder","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1070754/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57551.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57551.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57551.jpg"},"name":"斯蒂芬·卓博斯基","id":"1070754"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507709428.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507709428.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507709428.jpg"},"alt":"https://movie.douban.com/subject/26787574/","id":"26787574"},{"rating":{"max":10,"average":7.5,"stars":"40","min":0},"genres":["喜剧","动画","冒险"],"title":"公牛历险记","casts":[{"alt":"https://movie.douban.com/celebrity/1044883/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23477.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23477.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23477.jpg"},"name":"约翰·塞纳","id":"1044883"},{"alt":"https://movie.douban.com/celebrity/1319532/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.jpg"},"name":"凯特·麦克金农","id":"1319532"},{"alt":"https://movie.douban.com/celebrity/1387308/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1516269761.38.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1516269761.38.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1516269761.38.jpg"},"name":"莉莉·戴","id":"1387308"}],"collect_count":6340,"original_title":"Ferdinand","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1009704/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4833.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4833.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4833.jpg"},"name":"卡洛斯·沙尔丹哈","id":"1009704"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510825300.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510825300.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510825300.jpg"},"alt":"https://movie.douban.com/subject/25846857/","id":"25846857"},{"rating":{"max":10,"average":7.2,"stars":"35","min":0},"genres":["动作","奇幻","冒险"],"title":"勇敢者游戏：决战丛林","casts":[{"alt":"https://movie.douban.com/celebrity/1044707/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.jpg"},"name":"道恩·强森","id":"1044707"},{"alt":"https://movie.douban.com/celebrity/1286162/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.jpg"},"name":"凯文·哈特","id":"1286162"},{"alt":"https://movie.douban.com/celebrity/1049492/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35722.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35722.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35722.jpg"},"name":"杰克·布莱克","id":"1049492"}],"collect_count":53586,"original_title":"Jumanji: Welcome to the Jungle","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1040862/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515078777.46.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515078777.46.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515078777.46.jpg"},"name":"杰克·卡斯丹","id":"1040862"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506258944.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506258944.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506258944.jpg"},"alt":"https://movie.douban.com/subject/26586766/","id":"26586766"},{"rating":{"max":10,"average":5.7,"stars":"30","min":0},"genres":["喜剧","爱情"],"title":"前任3：再见前任","casts":[{"alt":"https://movie.douban.com/celebrity/1275667/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14025.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14025.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14025.jpg"},"name":"韩庚","id":"1275667"},{"alt":"https://movie.douban.com/celebrity/1275564/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366015827.84.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366015827.84.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366015827.84.jpg"},"name":"郑恺","id":"1275564"},{"alt":"https://movie.douban.com/celebrity/1342252/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408089064.98.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408089064.98.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408089064.98.jpg"},"name":"于文文","id":"1342252"}],"collect_count":125090,"original_title":"前任3：再见前任","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1332171/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1391439365.41.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1391439365.41.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1391439365.41.jpg"},"name":"田羽生","id":"1332171"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.jpg"},"alt":"https://movie.douban.com/subject/26662193/","id":"26662193"},{"rating":{"max":10,"average":5.2,"stars":"25","min":0},"genres":["剧情","动作"],"title":"英雄本色2018","casts":[{"alt":"https://movie.douban.com/celebrity/1314544/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509429399.29.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509429399.29.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1509429399.29.jpg"},"name":"王凯","id":"1314544"},{"alt":"https://movie.douban.com/celebrity/1312820/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422629943.25.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422629943.25.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422629943.25.jpg"},"name":"马天宇","id":"1312820"},{"alt":"https://movie.douban.com/celebrity/1341187/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pbA7b3PGSjgMcel_avatar_uploaded1404566496.8.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pbA7b3PGSjgMcel_avatar_uploaded1404566496.8.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pbA7b3PGSjgMcel_avatar_uploaded1404566496.8.jpg"},"name":"王大陆","id":"1341187"}],"collect_count":13791,"original_title":"英雄本色2018","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1274856/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20143.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20143.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20143.jpg"},"name":"丁晟","id":"1274856"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508615612.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508615612.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508615612.jpg"},"alt":"https://movie.douban.com/subject/26827040/","id":"26827040"},{"rating":{"max":10,"average":3.9,"stars":"20","min":0},"genres":["动作","冒险"],"title":"谜巢","casts":[{"alt":"https://movie.douban.com/celebrity/1040990/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37168.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37168.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37168.jpg"},"name":"李冰冰","id":"1040990"},{"alt":"https://movie.douban.com/celebrity/1031799/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365919064.64.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365919064.64.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365919064.64.jpg"},"name":"凯南·鲁兹","id":"1031799"},{"alt":"https://movie.douban.com/celebrity/1028237/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28356.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28356.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28356.jpg"},"name":"吴尊","id":"1028237"}],"collect_count":5020,"original_title":"谜巢","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1321989/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51900.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51900.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51900.jpg"},"name":"金波·兰道","id":"1321989"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510144625.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510144625.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2510144625.jpg"},"alt":"https://movie.douban.com/subject/26612285/","id":"26612285"},{"rating":{"max":10,"average":7.8,"stars":"40","min":0},"genres":["剧情","历史","战争"],"title":"芳华","casts":[{"alt":"https://movie.douban.com/celebrity/1276105/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg"},"name":"黄轩","id":"1276105"},{"alt":"https://movie.douban.com/celebrity/1366978/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512871367.97.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512871367.97.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1512871367.97.jpg"},"name":"苗苗","id":"1366978"},{"alt":"https://movie.douban.com/celebrity/1357009/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504775118.88.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504775118.88.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504775118.88.jpg"},"name":"钟楚曦","id":"1357009"}],"collect_count":302180,"original_title":"芳华","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1274255/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p45667.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p45667.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p45667.jpg"},"name":"冯小刚","id":"1274255"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.jpg"},"alt":"https://movie.douban.com/subject/26862829/","id":"26862829"},{"rating":{"max":10,"average":6.6,"stars":"35","min":0},"genres":["剧情","传记","历史"],"title":"第一夫人","casts":[{"alt":"https://movie.douban.com/celebrity/1054454/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2274.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2274.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2274.jpg"},"name":"娜塔莉·波特曼","id":"1054454"},{"alt":"https://movie.douban.com/celebrity/1031800/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7767.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7767.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7767.jpg"},"name":"彼得·萨斯加德","id":"1031800"},{"alt":"https://movie.douban.com/celebrity/1022652/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9187.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9187.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9187.jpg"},"name":"格蕾塔·葛韦格","id":"1022652"}],"collect_count":19124,"original_title":"Jackie","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1322530/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1424616477.73.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1424616477.73.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1424616477.73.jpg"},"name":"帕布罗·拉雷恩","id":"1322530"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508339738.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508339738.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508339738.jpg"},"alt":"https://movie.douban.com/subject/4849728/","id":"4849728"},{"rating":{"max":10,"average":7.2,"stars":"40","min":0},"genres":["动作","科幻","冒险"],"title":"星球大战8：最后的绝地武士","casts":[{"alt":"https://movie.douban.com/celebrity/1027809/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452759480.3.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452759480.3.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452759480.3.jpg"},"name":"马克·哈米尔","id":"1027809"},{"alt":"https://movie.douban.com/celebrity/1027813/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1482901672.88.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1482901672.88.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1482901672.88.jpg"},"name":"凯丽·费雪","id":"1027813"},{"alt":"https://movie.douban.com/celebrity/1339916/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1444659264.8.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1444659264.8.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1444659264.8.jpg"},"name":"黛西·雷德利","id":"1339916"}],"collect_count":65728,"original_title":"Star Wars: The Last Jedi","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1036605/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p55599.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p55599.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p55599.jpg"},"name":"莱恩·约翰逊","id":"1036605"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.jpg"},"alt":"https://movie.douban.com/subject/22265634/","id":"22265634"},{"rating":{"max":10,"average":7.7,"stars":"40","min":0},"genres":["动作","冒险"],"title":"太空救援","casts":[{"alt":"https://movie.douban.com/celebrity/1023442/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368685365.9.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368685365.9.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368685365.9.jpg"},"name":"弗拉季米尔·弗多维琴科夫","id":"1023442"},{"alt":"https://movie.douban.com/celebrity/1194282/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416541847.87.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416541847.87.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416541847.87.jpg"},"name":"巴维尔·捷列连科","id":"1194282"},{"alt":"https://movie.douban.com/celebrity/1327850/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486282779.93.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486282779.93.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486282779.93.jpg"},"name":"柳波芙·阿克肖诺娃","id":"1327850"}],"collect_count":15239,"original_title":"Салют-7","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1382988/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511446479.18.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511446479.18.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511446479.18.jpg"},"name":"克里姆·斯彭科","id":"1382988"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508922375.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508922375.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508922375.jpg"},"alt":"https://movie.douban.com/subject/27073291/","id":"27073291"},{"rating":{"max":10,"average":9,"stars":"45","min":0},"genres":["喜剧","动画","冒险"],"title":"寻梦环游记","casts":[{"alt":"https://movie.douban.com/celebrity/1370411/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.jpg"},"name":"安东尼·冈萨雷斯","id":"1370411"},{"alt":"https://movie.douban.com/celebrity/1041009/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.jpg"},"name":"盖尔·加西亚·贝纳尔","id":"1041009"},{"alt":"https://movie.douban.com/celebrity/1036383/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.jpg"},"name":"本杰明·布拉特","id":"1036383"}],"collect_count":383006,"original_title":"Coco","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1022678/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.jpg"},"name":"李·昂克里奇","id":"1022678"},{"alt":"https://movie.douban.com/celebrity/1370425/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.jpg"},"name":"阿德里安·莫利纳","id":"1370425"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.jpg"},"alt":"https://movie.douban.com/subject/20495023/","id":"20495023"},{"rating":{"max":10,"average":6.3,"stars":"35","min":0},"genres":["喜剧","犯罪","悬疑"],"title":"迷镇凶案","casts":[{"alt":"https://movie.douban.com/celebrity/1054443/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p620.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p620.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p620.jpg"},"name":"马特·达蒙","id":"1054443"},{"alt":"https://movie.douban.com/celebrity/1054519/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.jpg"},"name":"朱丽安·摩尔","id":"1054519"},{"alt":"https://movie.douban.com/celebrity/1012481/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415796703.28.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415796703.28.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415796703.28.jpg"},"name":"奥斯卡·伊萨克","id":"1012481"}],"collect_count":4515,"original_title":"Suburbicon","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1054433/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13776.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13776.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13776.jpg"},"name":"乔治·克鲁尼","id":"1054433"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508546069.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508546069.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508546069.jpg"},"alt":"https://movie.douban.com/subject/2133433/","id":"2133433"},{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["剧情","悬疑","奇幻"],"title":"妖猫传","casts":[{"alt":"https://movie.douban.com/celebrity/1276105/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1449935218.59.jpg"},"name":"黄轩","id":"1276105"},{"alt":"https://movie.douban.com/celebrity/1315737/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p50940.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p50940.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p50940.jpg"},"name":"染谷将太","id":"1315737"},{"alt":"https://movie.douban.com/celebrity/1274494/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510497293.38.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510497293.38.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510497293.38.jpg"},"name":"张雨绮","id":"1274494"}],"collect_count":216366,"original_title":"妖猫传","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1023040/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451727734.81.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451727734.81.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451727734.81.jpg"},"name":"陈凯歌","id":"1023040"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.jpg"},"alt":"https://movie.douban.com/subject/5350027/","id":"5350027"},{"rating":{"max":10,"average":7.2,"stars":"35","min":0},"genres":["动画"],"title":"大世界","casts":[{"alt":"https://movie.douban.com/celebrity/1386918/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515853243.73.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515853243.73.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515853243.73.jpg"},"name":"朱昌龙","id":"1386918"},{"alt":"https://movie.douban.com/celebrity/1386919/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515900370.2.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515900370.2.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515900370.2.jpg"},"name":"曹寇","id":"1386919"},{"alt":"https://movie.douban.com/celebrity/1386920/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"杨思明","id":"1386920"}],"collect_count":13957,"original_title":"大世界","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1275433/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484937150.59.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484937150.59.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484937150.59.jpg"},"name":"刘健","id":"1275433"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508258043.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508258043.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508258043.jpg"},"alt":"https://movie.douban.com/subject/26954003/","id":"26954003"},{"rating":{"max":10,"average":6.1,"stars":"30","min":0},"genres":["动作","犯罪","悬疑"],"title":"心理罪之城市之光","casts":[{"alt":"https://movie.douban.com/celebrity/1274235/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.jpg"},"name":"邓超","id":"1274235"},{"alt":"https://movie.douban.com/celebrity/1259866/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21006.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21006.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21006.jpg"},"name":"阮经天","id":"1259866"},{"alt":"https://movie.douban.com/celebrity/1274533/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35797.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35797.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p35797.jpg"},"name":"刘诗诗","id":"1274533"}],"collect_count":37506,"original_title":"心理罪之城市之光","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1317195/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38956.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38956.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38956.jpg"},"name":"徐纪周","id":"1317195"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.jpg"},"alt":"https://movie.douban.com/subject/26774722/","id":"26774722"},{"rating":{"max":10,"average":6.1,"stars":"30","min":0},"genres":["喜剧","爱情","奇幻"],"title":"二代妖精之今生有幸","casts":[{"alt":"https://movie.douban.com/celebrity/1275721/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36925.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36925.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36925.jpg"},"name":"冯绍峰","id":"1275721"},{"alt":"https://movie.douban.com/celebrity/1049732/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1513067217.13.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1513067217.13.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1513067217.13.jpg"},"name":"刘亦菲","id":"1049732"},{"alt":"https://movie.douban.com/celebrity/1275178/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37722.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37722.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p37722.jpg"},"name":"李光洁","id":"1275178"}],"collect_count":34232,"original_title":"二代妖精之今生有幸","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1331182/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426816047.48.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426816047.48.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426816047.48.jpg"},"name":"肖洋","id":"1331182"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.jpg","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.jpg","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.jpg"},"alt":"https://movie.douban.com/subject/26797419/","id":"26797419"},{"rating":{"max":10,"average":5.3,"stars":"30","min":0},"genres":["剧情","奇幻"],"title":"解忧杂货店","casts":[{"alt":"https://movie.douban.com/celebrity/1339594/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377320.23.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377320.23.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377320.23.jpg"},"name":"王俊凯","id":"1339594"},{"alt":"https://movie.douban.com/celebrity/1325127/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492095415.48.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492095415.48.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492095415.48.jpg"},"name":"迪丽热巴","id":"1325127"},{"alt":"https://movie.douban.com/celebrity/1330472/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1385100761.5.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1385100761.5.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1385100761.5.jpg"},"name":"董子健","id":"1330472"}],"collect_count":35095,"original_title":"解忧杂货店","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1316056/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34888.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34888.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34888.jpg"},"name":"韩杰","id":"1316056"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.jpg"},"alt":"https://movie.douban.com/subject/26654146/","id":"26654146"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean implements Serializable{
        /**
         * rating : {"max":10,"average":7.5,"stars":"40","min":0}
         * genres : ["剧情","爱情","战争"]
         * title : 无问西东
         * casts : [{"alt":"https://movie.douban.com/celebrity/1041014/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359895311.0.jpg"},"name":"章子怡","id":"1041014"},{"alt":"https://movie.douban.com/celebrity/1041404/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.jpg"},"name":"黄晓明","id":"1041404"},{"alt":"https://movie.douban.com/celebrity/1077991/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1453574419.48.jpg"},"name":"张震","id":"1077991"}]
         * collect_count : 152742
         * original_title : 无问西东
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1313682/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19485.jpg"},"name":"李芳芳","id":"1313682"}]
         * year : 2018
         * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507572275.jpg"}
         * alt : https://movie.douban.com/subject/6874741/
         * id : 6874741
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<DirectorsBean> directors;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
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

        public static class RatingBean implements Serializable{
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

        public static class ImagesBean implements Serializable{
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

        public static class CastsBean implements Serializable{
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

            public static class AvatarsBean implements Serializable{
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

        public static class DirectorsBean implements Serializable{
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

            public static class AvatarsBeanX implements Serializable{
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
}
