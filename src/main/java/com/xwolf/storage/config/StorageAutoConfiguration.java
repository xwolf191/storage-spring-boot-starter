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
@Configuration
@EnableConfigurationProperties(StorageProperties.class)
@ConditionalOnClass(StorageService.class)
@ConditionalOnProperty(prefix = "storage", value = "enabled",matchIfMissing = true)
public class StorageAutoConfiguration {

    @Autowired
    private StorageProperties storageProperties;

}
