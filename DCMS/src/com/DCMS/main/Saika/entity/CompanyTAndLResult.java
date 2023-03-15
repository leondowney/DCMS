package com.DCMS.main.Saika.entity;

import java.util.Arrays;

/**
 * Author：jiangtao_liu
 * Date：2023/3/11
 * Description：叠加柱状图返回前端的实体类
 */
public class CompanyTAndLResult {

    private String type01;
    private int[] count;


    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01;
    }

    public int[] getCount() {
        return count;
    }

    public void setCount(int[] count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CompanyTAndLResult{" +
                "type01='" + type01 + '\'' +
                ", count=" + Arrays.toString(count) +
                '}';
    }
}
