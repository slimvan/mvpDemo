package com.xingyun.mvpdemo.model;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/12.
 * desc:
 */

public class MusicListBean {


    /**
     * song_list : [{"artist_id":"770","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_90,h_90","country":"其他","area":"4","publishtime":"1994-06-30","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/31168618/31168618.lrc","copy_type":"1","hot":"78874","all_artist_ting_uid":"1378","resource_type":"0","is_new":"0","rank_change":"0","rank":"1","all_artist_id":"770","style":"流行,摇滚","del_status":"0","relate_status":"0","toneid":"600902000000025925","all_rate":"64,128,256,320,flac","file_duration":323,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-太合麦田 ","res_encryption_flag":"0","song_id":"288867","title":"回到拉萨","ting_uid":"1378","author":"郑钧","album_id":"70313","album_title":"赤裸裸","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0100000000","artist_name":"郑钧","pic_radio":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_1000,h_1000"},{"artist_id":"371","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2000-11-30","album_no":"10","lrclink":"http://qukufile2.qianqian.com/data2/lrc/13911581/13911581.lrc","copy_type":"1","hot":"49653","all_artist_ting_uid":"1226","resource_type":"0","is_new":"0","rank_change":"0","rank":"2","all_artist_id":"371","style":"流行","del_status":"0","relate_status":"0","toneid":"600902000000026112","all_rate":"64,128,256,320,flac","file_duration":248,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-太合麦田 ","res_encryption_flag":"0","song_id":"247696","title":"那一年","ting_uid":"1226","author":"许巍","album_id":"61879","album_title":"那一年","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"1000000000","artist_name":"许巍","pic_radio":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_1,w_1000,h_1000"},{"artist_id":"127","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_90,h_90","country":"港台","area":"1","publishtime":"2005-08-26","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/13905729/13905729.lrc","copy_type":"1","hot":"15870","all_artist_ting_uid":"1098","resource_type":"0","is_new":"0","rank_change":"0","rank":"3","all_artist_id":"127","style":"流行","del_status":"0","relate_status":"0","toneid":"600902000007974720","all_rate":"64,128,256,320,flac","file_duration":257,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"滚石国际音乐股份有限公司","res_encryption_flag":"0","song_id":"1686649","title":"知足","ting_uid":"1098","author":"五月天","album_id":"182007","album_title":"知足 最真杰作选","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0100000000","artist_name":"五月天","pic_radio":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_500,h_500","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/f19a35ddcf1e1af6eb60e432b78e5530/182007/182007.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":""},{"artist_id":"467","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg@s_1,w_90,h_90","country":"其他","area":"4","publishtime":"1997-12-01","album_no":"6","lrclink":"http://qukufile2.qianqian.com/data2/lrc/13974186/13974186.lrc","copy_type":"1","hot":"8666","all_artist_ting_uid":"1288","resource_type":"0","is_new":"0","rank_change":"0","rank":"4","all_artist_id":"467","style":"流行","del_status":"0","relate_status":"0","toneid":"600902000001102475","all_rate":"64,128,256,320,flac","file_duration":170,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-太合麦田 ","res_encryption_flag":"0","song_id":"265315","title":"在路上","ting_uid":"1288","author":"麦田守望者","album_id":"62749","album_title":"麦田守望者","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"麦田守望者","pic_radio":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg","pic_premium":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/9269560ab00aa9ccb973db2b108be36f/62749/62749.jpg","album_800_800":"","album_1000_1000":""},{"artist_id":"1978","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2012-12-31","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/33467609/33467609.lrc","copy_type":"1","hot":"6639","all_artist_ting_uid":"10619","resource_type":"0","is_new":"0","rank_change":"0","rank":"5","all_artist_id":"1978","style":"流行","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":245,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-摩登天空","res_encryption_flag":"0","song_id":"33467253","title":"玛卡瑞纳","ting_uid":"10619","author":"海龟先生","album_id":"33467408","album_title":"海龟先生","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0100000000","artist_name":"海龟先生","pic_radio":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/0904c559370df2a559fec43c1ca678c6/556261912/556261912.jpg@s_1,w_1000,h_1000"},{"artist_id":"60571","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"1997-06-01","album_no":"10","lrclink":"http://qukufile2.qianqian.com/data2/lrc/240280241/240280241.lrc","copy_type":"1","hot":"7503","all_artist_ting_uid":"6045","resource_type":"0","is_new":"0","rank_change":"0","rank":"6","all_artist_id":"60571","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":450,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北 京）有限公司-京文曲库","res_encryption_flag":"0","song_id":"753150","title":"晚安北京","ting_uid":"6045","author":"鲍家街43号","album_id":"14603141","album_title":"鲍家街43号","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"鲍家街43号","pic_radio":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_500,h_500","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/d17f34dfec4032a24e65648ae62d6494/566038939/566038939.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":""},{"artist_id":"276","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_90,h_90","country":"港台","area":"1","publishtime":"2006-12-01","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/13859651/13859651.lrc","copy_type":"1","hot":"4518","all_artist_ting_uid":"1170","resource_type":"0","is_new":"0","rank_change":"0","rank":"7","all_artist_id":"276","style":"流行","del_status":"0","relate_status":"0","toneid":"600902000006810457","all_rate":"64,128,256,320","file_duration":267,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-亚神","res_encryption_flag":"0","song_id":"252038","title":"女爵","ting_uid":"1170","author":"杨乃文","album_id":"62822","album_title":"女爵","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"1100000000","artist_name":"杨乃文","pic_radio":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/46ed52a4b141451ee3b5cfc9817ea758/584974224/584974224.jpg@s_1,w_1000,h_1000"},{"artist_id":"1992255","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2013-03-03","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/35124295/35124295.lrc","copy_type":"1","hot":"2908","all_artist_ting_uid":"2393","resource_type":"0","is_new":"0","rank_change":"0","rank":"8","all_artist_id":"1992255","style":"摇滚","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":284,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-摩登天空","res_encryption_flag":"0","song_id":"35121586","title":"与声音跳舞","ting_uid":"2393","author":"谢天笑","album_id":"35122087","album_title":"幻觉","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"1100000000","artist_name":"谢天笑","pic_radio":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/20454b353be803833fd3ab0cf4784950/556230142/556230142.jpg@s_1,w_1000,h_1000"},{"artist_id":"1044","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"1992-12-07","album_no":"2","lrclink":"http://qukufile2.qianqian.com/data2/lrc/240401343/240401343.lrc","copy_type":"1","hot":"3055","all_artist_ting_uid":"2577","resource_type":"0","is_new":"0","rank_change":"0","rank":"9","all_artist_id":"1044","style":"流行,摇滚","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":355,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"滚石国际音乐股份有限公司","res_encryption_flag":"0","song_id":"1039818","title":"太阳","ting_uid":"2577","author":"唐朝乐队","album_id":"109048","album_title":"唐朝","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"唐朝乐队","pic_radio":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg","pic_premium":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/500c57aba4c921fda14500d1c734a001/109048/109048.jpg","album_800_800":"","album_1000_1000":""},{"artist_id":"512","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"1994-10-06","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/271102/271102.lrc","copy_type":"1","hot":"2785","all_artist_ting_uid":"1303","resource_type":"0","is_new":"0","rank_change":"0","rank":"10","all_artist_id":"512","style":"流行","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":213,"has_mv_mobile":1,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"滚石国际音乐股份有限公司","res_encryption_flag":"0","song_id":"271101","title":"垃圾场","ting_uid":"1303","author":"何勇","album_id":"62818","album_title":"垃圾场","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":1,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"1100000000","artist_name":"何勇","pic_radio":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/d990f68b964591aff4355b1e01e4b8e3/62818/62818.jpg"},{"artist_id":"1259","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg@s_1,w_90,h_90","country":"其他","area":"4","publishtime":"0000-00-00","album_no":"10","lrclink":"http://qukufile2.qianqian.com/data2/lrc/12645237/12645237.lrc","copy_type":"1","hot":"1506","all_artist_ting_uid":"2588","resource_type":"0","is_new":"0","rank_change":"0","rank":"11","all_artist_id":"1259","style":"流行","del_status":"0","relate_status":"0","toneid":"600902000004204074","all_rate":"64,128,256","file_duration":102,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北 京）有限公司-京文曲库","res_encryption_flag":"0","song_id":"1990000","title":"时代","ting_uid":"2588","author":"脑浊乐队","album_id":"65548933","album_title":"1998圣诞无聊军队在嚎叫","is_first_publish":0,"havehigh":0,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"脑浊乐队","pic_radio":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg","pic_premium":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/20d251f0af49c12779a225cfde602acf/65548933/65548933.jpg","album_800_800":"","album_1000_1000":""}]
     * billboard : {"billboard_type":"11","billboard_no":"2023","update_date":"2018-04-12","billboard_songnum":"11","havemore":1,"name":"摇滚榜","comment":"实时展现百度音乐最热门摇滚歌曲排行","pic_s192":"http://hiphotos.qianqian.com/ting/pic/item/f2deb48f8c5494ee2b2a8c7f2ef5e0fe99257e48.jpg","pic_s640":"http://hiphotos.qianqian.com/ting/pic/item/b21c8701a18b87d66d9157ea050828381e30fd70.jpg","pic_s444":"http://hiphotos.qianqian.com/ting/pic/item/b8014a90f603738d0f3b6724b11bb051f819ec47.jpg","pic_s260":"http://hiphotos.qianqian.com/ting/pic/item/f11f3a292df5e0fea16ee2075e6034a85edf7245.jpg","pic_s210":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_f685a2e7aecdca2bb14d78cbbf4faa25.jpg","web_url":"http://music.baidu.com/top/rock"}
     * error_code : 22000
     */

    private BillboardBean billboard;
    private int error_code;
    private List<SongListBean> song_list;

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<SongListBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongListBean> song_list) {
        this.song_list = song_list;
    }

    public static class BillboardBean {
        /**
         * billboard_type : 11
         * billboard_no : 2023
         * update_date : 2018-04-12
         * billboard_songnum : 11
         * havemore : 1
         * name : 摇滚榜
         * comment : 实时展现百度音乐最热门摇滚歌曲排行
         * pic_s192 : http://hiphotos.qianqian.com/ting/pic/item/f2deb48f8c5494ee2b2a8c7f2ef5e0fe99257e48.jpg
         * pic_s640 : http://hiphotos.qianqian.com/ting/pic/item/b21c8701a18b87d66d9157ea050828381e30fd70.jpg
         * pic_s444 : http://hiphotos.qianqian.com/ting/pic/item/b8014a90f603738d0f3b6724b11bb051f819ec47.jpg
         * pic_s260 : http://hiphotos.qianqian.com/ting/pic/item/f11f3a292df5e0fea16ee2075e6034a85edf7245.jpg
         * pic_s210 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_f685a2e7aecdca2bb14d78cbbf4faa25.jpg
         * web_url : http://music.baidu.com/top/rock
         */

        private String billboard_type;
        private String billboard_no;
        private String update_date;
        private String billboard_songnum;
        private int havemore;
        private String name;
        private String comment;
        private String pic_s192;
        private String pic_s640;
        private String pic_s444;
        private String pic_s260;
        private String pic_s210;
        private String web_url;

        public String getBillboard_type() {
            return billboard_type;
        }

        public void setBillboard_type(String billboard_type) {
            this.billboard_type = billboard_type;
        }

        public String getBillboard_no() {
            return billboard_no;
        }

        public void setBillboard_no(String billboard_no) {
            this.billboard_no = billboard_no;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        public String getBillboard_songnum() {
            return billboard_songnum;
        }

        public void setBillboard_songnum(String billboard_songnum) {
            this.billboard_songnum = billboard_songnum;
        }

        public int getHavemore() {
            return havemore;
        }

        public void setHavemore(int havemore) {
            this.havemore = havemore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public void setPic_s192(String pic_s192) {
            this.pic_s192 = pic_s192;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public void setPic_s640(String pic_s640) {
            this.pic_s640 = pic_s640;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public void setPic_s444(String pic_s444) {
            this.pic_s444 = pic_s444;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public void setPic_s260(String pic_s260) {
            this.pic_s260 = pic_s260;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public void setPic_s210(String pic_s210) {
            this.pic_s210 = pic_s210;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }

    public static class SongListBean {
        /**
         * artist_id : 770
         * language : 国语
         * pic_big : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_150,h_150
         * pic_small : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_90,h_90
         * country : 其他
         * area : 4
         * publishtime : 1994-06-30
         * album_no : 1
         * lrclink : http://qukufile2.qianqian.com/data2/lrc/31168618/31168618.lrc
         * copy_type : 1
         * hot : 78874
         * all_artist_ting_uid : 1378
         * resource_type : 0
         * is_new : 0
         * rank_change : 0
         * rank : 1
         * all_artist_id : 770
         * style : 流行,摇滚
         * del_status : 0
         * relate_status : 0
         * toneid : 600902000000025925
         * all_rate : 64,128,256,320,flac
         * file_duration : 323
         * has_mv_mobile : 1
         * versions :
         * bitrate_fee : {"0":"0|0","1":"0|0"}
         * biaoshi : lossless
         * info :
         * has_filmtv : 0
         * si_proxycompany : 华宇世博音乐文化（北京）有限公司-太合麦田
         * res_encryption_flag : 0
         * song_id : 288867
         * title : 回到拉萨
         * ting_uid : 1378
         * author : 郑钧
         * album_id : 70313
         * album_title : 赤裸裸
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * has_mv : 1
         * learn : 1
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 0
         * mv_provider : 0100000000
         * artist_name : 郑钧
         * pic_radio : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_300,h_300
         * pic_s500 : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500
         * pic_premium : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500
         * pic_huge : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_1000,h_1000
         * album_500_500 : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_500,h_500
         * album_800_800 :
         * album_1000_1000 : http://qukufile2.qianqian.com/data2/pic/ea5c9b6e9024b2bbee9cb392e3011523/557288577/557288577.jpg@s_1,w_1000,h_1000
         */

        private String artist_id;
        private String language;
        private String pic_big;
        private String pic_small;
        private String country;
        private String area;
        private String publishtime;
        private String album_no;
        private String lrclink;
        private String copy_type;
        private String hot;
        private String all_artist_ting_uid;
        private String resource_type;
        private String is_new;
        private String rank_change;
        private String rank;
        private String all_artist_id;
        private String style;
        private String del_status;
        private String relate_status;
        private String toneid;
        private String all_rate;
        private int file_duration;
        private int has_mv_mobile;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String info;
        private String has_filmtv;
        private String si_proxycompany;
        private String res_encryption_flag;
        private String song_id;
        private String title;
        private String ting_uid;
        private String author;
        private String album_id;
        private String album_title;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int has_mv;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String pic_radio;
        private String pic_s500;
        private String pic_premium;
        private String pic_huge;
        private String album_500_500;
        private String album_800_800;
        private String album_1000_1000;
        private boolean isPlaying;

        public boolean isPlaying() {
            return isPlaying;
        }

        public void setPlaying(boolean playing) {
            isPlaying = playing;
        }

        public String getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(String artist_id) {
            this.artist_id = artist_id;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getAlbum_no() {
            return album_no;
        }

        public void setAlbum_no(String album_no) {
            this.album_no = album_no;
        }

        public String getLrclink() {
            return lrclink;
        }

        public void setLrclink(String lrclink) {
            this.lrclink = lrclink;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }

        public void setAll_artist_ting_uid(String all_artist_ting_uid) {
            this.all_artist_ting_uid = all_artist_ting_uid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getRank_change() {
            return rank_change;
        }

        public void setRank_change(String rank_change) {
            this.rank_change = rank_change;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getHas_filmtv() {
            return has_filmtv;
        }

        public void setHas_filmtv(String has_filmtv) {
            this.has_filmtv = has_filmtv;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getRes_encryption_flag() {
            return res_encryption_flag;
        }

        public void setRes_encryption_flag(String res_encryption_flag) {
            this.res_encryption_flag = res_encryption_flag;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s500() {
            return pic_s500;
        }

        public void setPic_s500(String pic_s500) {
            this.pic_s500 = pic_s500;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getAlbum_500_500() {
            return album_500_500;
        }

        public void setAlbum_500_500(String album_500_500) {
            this.album_500_500 = album_500_500;
        }

        public String getAlbum_800_800() {
            return album_800_800;
        }

        public void setAlbum_800_800(String album_800_800) {
            this.album_800_800 = album_800_800;
        }

        public String getAlbum_1000_1000() {
            return album_1000_1000;
        }

        public void setAlbum_1000_1000(String album_1000_1000) {
            this.album_1000_1000 = album_1000_1000;
        }
    }
}
