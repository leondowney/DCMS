package com.DCMS.main.yangLi.Bean;

/**
 * author: 李洋
 * datetime:2023/3/10 11:38
 * email:1473321819@qq.com
 *
 * @description:
 */
public class Result {
    private Integer status;
    private String  msg;
    private Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
