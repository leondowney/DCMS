package com.DCMS.main.LeonDowney.entity;

/**
 * @author Leon Downey
 * @date 2023/3/12 00:17
 * @describe： 响应实体类
 */
public class Result {

    private Integer status;
    private String msg;
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

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
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

    public Result() {
    }
}
