package com.xwolf.storage.util;

/**
 * 字符串处理
 * @author xwolf
 * @since 1.8
 */
public class StringUtils {

    private static final String UNDERLINE="_";

    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }

    public static boolean isBlank(String str){
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    /**
     * 将驼峰命名法转化为_链接的字符串
     * @param param
     * @return
     */
    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 将下划线转化为驼峰命名
     * @return
     */
    public static String underlineToCamel(String param){
        return underlineToCamel(param,false);
    }

    /**
     * 将下划线转化为驼峰命名
     * @param param
     * @param firstToUpperCase  不过不包含下划线 首字母是否大写
     * @return
     */
    public static String underlineToCamel(String param,boolean firstToUpperCase){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int index=param.indexOf(UNDERLINE);
        StringBuilder builder=new StringBuilder(param);
        if(index!=-1){
            char a=param.charAt(index+1);
            builder.replace(index,index+2,String.valueOf(Character.toUpperCase(a)));
            return  underlineToCamel(builder.toString());
        } else{
            return firstToUpperCase?builder.replace(0,1,String.valueOf(Character.toUpperCase(param.charAt(0)))).toString():
                    builder.toString();
        }
    }

    /**
     * 防止SQL注入
     * @param sql 原始字符串
     * @return 处理后的字符串
     */
    public static String escapeSql(String sql){
        return sql.replaceAll("'","''");
    }

    /**
     * 删除前缀
     * @param param
     * @return
     */
    public static String deletePrefix(String param,String prefix){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        if (!param.contains(prefix)){
            return param;
        }
        int  pdx =  param.indexOf(prefix);
        int idx = pdx+prefix.length();
        return param.substring(idx);
    }

    /**
     * 删除前缀或者首字母小写
     * @param param
     * @return
     */
    public static String firstCharToLowerCase(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        StringBuilder builder = new StringBuilder(param);
        builder.replace(0,1,String.valueOf(Character.toLowerCase(builder.charAt(0))));
        return builder.toString();
    }

    /**
     * 首字母大写
     * @param param
     * @return
     */
    public static String firstCharToUpperCase(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        StringBuilder builder = new StringBuilder(param);
        builder.replace(0,1,String.valueOf(Character.toUpperCase(builder.charAt(0))));
        return builder.toString();
    }

    /**
     * 删除最后一个
     * @param param
     * @return
     */
    public static String deleteLastChar(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        StringBuilder builder = new StringBuilder(param);
        int len = builder.length();
        return builder.substring(0,len-1).toString();
    }
}
