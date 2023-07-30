package com.example.mini1.comments.exception;

import com.example.mini1.common.exception.status.Status400Exception;

public class UnAuthCommentEditException extends Status400Exception {
    public UnAuthCommentEditException() {
        super("댓글 등록자만 수정이 가능합니다.");
    }
}
