package com.xwolf.storage.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.springframework.util.FileCopyUtils;

/**
 * 上传文件.
 *
 * @author xwolf
 */
public class IOUtil {

  /**
   * 上传文件.
   *
   * @param src
   * @param dest
   */
  public static boolean copy(File src, File dest) {
    try {
      FileCopyUtils.copy(src, dest);
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

  /**
   * 上传文件.
   *
   * @param bytes
   * @param dest
   */
  public static boolean copy(byte[] bytes, File dest) {
    try {
      FileCopyUtils.copy(bytes, dest);
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

  /**
   * 上传文件.
   *
   * @param in
   * @param out
   */
  public static boolean copy(InputStream in, OutputStream out) {
    try {
      FileCopyUtils.copy(in, out);
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

}
