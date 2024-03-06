package com.dion.todo.globar.exception;

public class BusinessException extends RuntimeException {

    // 예외에 대한 에러 코드
    private final ErrorCode errorCode;

    // 생성자
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    // 에러 코드 반환
    public ErrorCode getErrorCode() {
        return errorCode;
    }
}