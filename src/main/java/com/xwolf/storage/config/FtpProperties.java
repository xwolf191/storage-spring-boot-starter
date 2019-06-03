package com.xwolf.storage.config;

import lombok.Data;

/**
 * Local type.
 *
 * @author xwolf
 */
@Data
public class FtpProperties implements ConfigProperties{

  private String path;

  private int port;

  private String host;

  private String username;

  private String password;

}
