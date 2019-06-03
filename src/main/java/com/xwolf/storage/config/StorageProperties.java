package com.xwolf.storage.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xwolf
 **/
@Data
@ToString
@ConfigurationProperties(prefix = "storage")
public class StorageProperties {

    private boolean enabled;

    private LocalProperties local;

    private FtpProperties ftp;

    private OssProperties oss;

    private HdfsProperties hdfs;

    private FastDfsProperties fastdfs;

    private QiNiuProperties qiniu;
}
