package com.DCMS.main.yangLi.utils;

/**
 * author: 李洋
 * datetime:2023/3/10 21:59
 * email:1473321819@qq.com
 *
 * @description:
 */
public class StringUtil {


    public static boolean isNull(String str) {

        if (str==null || "".equals(str)) {
            return true;
        }else {
            return false;
        }
    }
}
