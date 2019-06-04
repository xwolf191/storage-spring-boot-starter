package com.xwolf.storage.config;

import lombok.Data;

/**
 * 阿里 oss type.
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
