package com.xwolf.storage.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 * Ftp tools.
 *
 * @author xwolf
 */
public class FtpUtil {

  private FTPClient ftpClient;


  public FtpUtil(String ip, int port, String userName, String password, int timeout, String charset)
      throws IOException {
    ftpClient = new FTPClient();
    ftpClient.setConnectTimeout(timeout);
    ftpClient.connect(ip, port);
    ftpClient.login(userName, password);
    //设置上传缓存大小
    ftpClient.setBufferSize(1024);
    //设置编码
    ftpClient.setControlEncoding(charset);
    //设置文件类型
    ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
  }

  /**
   * 下载ftp文件到本地
   *
   * @param remoteFileName 远程文件名称
   * @param localFile 本地文件[包含路径]
   * @return true/false
   * @throws IOException 异常
   */
  public boolean download(String remoteFileName, String localFile) throws IOException {
    boolean isSucc;
    File outFileName = new File(localFile);
    if(ftpClient == null) {
      throw new IOException("ftp server not login");
    }
    try(OutputStream outputStream = new FileOutputStream(outFileName)) {
      isSucc = ftpClient.retrieveFile(remoteFileName, outputStream);
    }
    return isSucc;
  }

  /**
   * 上传文件制定目录
   *
   * @param remoteFileName 远程文件名
   * @param localFile 本地文件[必须带路径]
   * @return true/false
   * @throws IOException 异常
   */
  public boolean upload(String remoteFileName, String localFile) throws IOException {
    boolean isSucc;
    try(InputStream inputStream = new FileInputStream(localFile)) {
      if(ftpClient == null) {
        throw new IOException("ftp server not login");
      }
      isSucc = ftpClient.storeFile(remoteFileName, inputStream);
    }
    return isSucc;
  }

  /**
   * 切换目录
   *
   * @param path 创建目录
   * @return 创建标志
   * @throws IOException 异常
   */
  public boolean changeDirectory(String path) throws IOException {
    return ftpClient.changeWorkingDirectory(path);
  }

  /**
   * 创建目录
   *
   * @param path 创建目录
   * @return 创建标志
   * @throws IOException 异常
   */
  public boolean createDirectory(String path) throws IOException {
    return ftpClient.makeDirectory(path);
  }


  /**
   * 自动关闭资源
   */
  public void close() throws Exception {
    if(ftpClient != null && ftpClient.isConnected()) {
      ftpClient.logout();
      ftpClient.disconnect();
    }
  }
}
