package com.xwolf.storage.service;

import com.xwolf.storage.config.StorageProperties;

/**
 * @author xwolf
 **/
public interface StorageDao {

    String upload(StorageProperties storageProperties);

    boolean download(StorageProperties storageProperties,String path);
}
