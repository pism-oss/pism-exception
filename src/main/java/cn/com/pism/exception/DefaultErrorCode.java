package cn.com.pism.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author perccyking
 * @since 24-08-24 16:36
 */
@AllArgsConstructor
@Getter
public enum DefaultErrorCode implements ErrorCode {

    SYSTEM_ERROR(0, "系统错误");

    private final Integer code;

    private final String msg;
}
