package com.xwolf.storage.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xwolf
 **/
@ConfigurationProperties(prefix = "storage")
public class StorageProperties {

    /**
     * 类型 0 :local 1:FTP 2:fastdfs
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "StorageProperties{" +
                "type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", path='" + path + '\'' +
                ", port=" + port +
                ", host='" + host + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
