package com.xwolf.storage.config;

import lombok.Data;

/**
 * 七牛云.
 *
 * @author xwolf
 */
@Data
public class QiNiuProperties implements ConfigProperties{

  private String secretKey;

  private String accessKey;

  /**
   * bucket
   */
  private String bucket;

  private long timeout;

}
