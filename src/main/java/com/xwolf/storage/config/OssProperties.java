package com.xwolf.storage.config;

import lombok.Data;

/**
 * HDFS type.
 *
 * @author xwolf
 */
@Data
public class OssProperties implements ConfigProperties{

  private String endpoint;

  private String accessId;

  private String accessKey;

  /**
   * bucket
   */
  private String bucket;

}
