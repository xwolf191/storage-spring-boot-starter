package com.xwolf.storage.config;

import com.xwolf.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xwolf
 **/
@Configuration//开启配置
@EnableConfigurationProperties(StorageProperties.class)//开启使用映射实体对象
@ConditionalOnClass(StorageService.class)//存在StorageService时初始化该配置类
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (    prefix = "storage",//存在配置前缀
             value = "enabled",//开启
             matchIfMissing = true//缺失检查
        )
public class StorageAutoConfiguration {

    @Autowired
    private StorageProperties storageProperties;




}
