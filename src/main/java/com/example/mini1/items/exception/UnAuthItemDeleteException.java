package com.example.mini1.items.exception;

import com.example.mini1.common.exception.status.Status400Exception;

public class UnAuthItemDeleteException extends Status400Exception {
    public UnAuthItemDeleteException() {
        super("상품 등록자만 삭제가 가능합니다.");
    }
}
