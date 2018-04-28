package com.xwolf.storage.service;

import com.xwolf.storage.util.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author xwolf
 **/

public class StorageService {
    /**
     * 默认本地
      */
    private String type = "0";

    /**
     * FastDFS url
     */
    private String url;

    /**
     * 指定路径
     */
    private String path;

    /**
     * 端口
     */
    private int port;

    /**
     * 主机
     */
    private String host;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * key
     */
    private String key;

    public StorageService(String type, String url, String path, int port, String host, String username, String password, String key) {
        this.type = type;
        this.url = url;
        this.path = path;
        this.port = port;
        this.host = host;
        this.username = username;
        this.password = password;
        this.key = key;
        init();
    }

    public void init(){

        if (StringUtils.isBlank(type)){
            throw new IllegalArgumentException("The argument {type} is missing");
        }
    }
}
