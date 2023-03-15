package com.DCMS.main.xiaodongLan.utils;

/**
 * @author 兰晓东
 * @create 2023-03-11 14:11
 * @describe:
 */
public class StringUtils {




    public static boolean isEmpty(String str){
        if(str != null && !str.equals("")){
            return true;
        }
        return false;
    }

    public static boolean isEmptyByInteger(Integer it){
        if(it != null && !it.equals("")){
            return true;
        }
        return false;
    }
}
