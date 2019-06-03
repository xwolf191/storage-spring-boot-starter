package com.xwolf.storage.config;

import lombok.Data;

/**
 * FastDFS type.
 *
 * @author xwolf
 */
@Data
public class FastDfsProperties implements ConfigProperties{

  /**
   * fastdfs client-client config
   */
  private String configPath;

}
