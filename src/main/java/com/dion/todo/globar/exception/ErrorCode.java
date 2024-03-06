package com.dion.todo.globar.exception;

public enum ErrorCode {
    USER_NOT_FOUND("User not found"),
    TODO_NOT_FOUND("Todo not found");

    private final String message;

    // 생성자
    ErrorCode(String message) {
        this.message = message;
    }

    // 에러 메시지 반환
    public String getMessage() {
        return message;
    }
}
