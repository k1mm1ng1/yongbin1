package com.dion.todo.globar.response;

public class BaseResponse<T> {

    // HTTP 응답 상태 코드
    private int status;

    // 응답 메시지
    private String message;

    // 응답 데이터
    private T data;

    // 생성자
    public BaseResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
