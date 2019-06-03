package com.xwolf.storage.config;

import lombok.Data;

/**
 * HDFS type.
 *
 * @author xwolf
 */
@Data
public class HdfsProperties implements ConfigProperties{

  /**
   * hdfs url
   */
  private String url;

}
