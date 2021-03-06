package com.shafa.tv.app;

/**
 *
 * 全局配置参数 如域名地址
 * Created by loe on 12/6/16.
 */
public class AppConfig {

    //public final static String HOST = "http://192.168.0.109:3000/";
    public final static String HOST = "http://120.27.33.15:3000/";
    public final static String TV_URL = HOST + "18tv/%s/%s/%s";
    public final static String TV_AD = HOST + "18tv/ad";
    public final static String TV_LOGIN = HOST + "user/login/";
    public final static String TV_LOGIN_RE= HOST + "user/login/%s/%s";
    public final static String TV_REGIST = HOST + "user/register/";
    public final static String TV_REGIST_RE = HOST + "user/register";
    public final static String TV_UPDATE = HOST + "18tv/updataApp";
    public final static String TV_INFO = HOST + "18tv";

    //直播节目类型
    public final static class TV_TYPE{
        public final static String TV_LIVE = "1";
        public final static String MOVIE = "2";
        public final static String VARIETY = "3";
        public final static String TV = "4";
        public final static String LIVE = "5";
    }
}
