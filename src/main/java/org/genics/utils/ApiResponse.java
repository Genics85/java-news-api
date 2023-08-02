package org.genics.utils;

public class ApiResponse<T> {
    String msg="Success";
    String code="001";
    T data;
    public ApiResponse(T value ){
        this.data = value;
    }
}
