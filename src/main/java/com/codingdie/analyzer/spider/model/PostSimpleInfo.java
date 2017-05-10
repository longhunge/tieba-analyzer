package com.codingdie.analyzer.spider.model;

import java.io.Serializable;

/**
 * Created by xupeng on 2017/4/19.
 */
public class PostSimpleInfo implements Serializable {

    public static  final String TYPE_NORMAL="normal";
    public static  final String TYPE_UNKONWN="unkonwn";

    public String lastUpdateTime;
    public String lastUpdateUser;
    public String createUser;
    public String title;
    public int remarkNum ;
    public String postId ;
    public String type=TYPE_NORMAL ;



}