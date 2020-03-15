package com.ideashin.one.team.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  数据传输对象
 *
 * @Author: Shin
 * @Date: 15/3/2020 15:53
 * @Blog: ideashin.com
 */
@Data
public class BaseResult implements Serializable {
    private static final String RESULT_OK = "ok";
    private static final String RESULT_NOT_OK = "not_ok";
    private static final String SUCCESS = "success";

    private String result;
    private Object data;
    private String success;
    private Cursor cursor;
    private List<Error> errorList;

    public  static BaseResult ok(){
        return getInstance(RESULT_OK, null, SUCCESS, null, null);
    }

    public  static BaseResult ok(Object data){
        return getInstance(RESULT_OK, data, SUCCESS, null, null);
    }

    public  static BaseResult notOk(List<Error> errorList){
        return getInstance(RESULT_NOT_OK, null, "", null, errorList);
    }


    /**
     * 对象初始化
     *
     * @param result
     * @param data
     * @param success
     * @param cursor
     * @param errorList
     * @return
     */
    private static BaseResult getInstance(String result, Object data, String success, Cursor cursor, List<Error> errorList) {
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(result);
        baseResult.setData(data);
        baseResult.setSuccess(success);
        baseResult.setCursor(cursor);
        baseResult.setErrorList(errorList);
        return baseResult;
    }

    /**
     * 分页信息记录
     */
    @Data
    public static class Cursor{
        private int total;
        private int offset;
        private int limit;
    }

    /**
     * 错误信息
     */
    @Data
    @AllArgsConstructor
    public static class Error{
        private String field;
        private String message;
    }

}
