package cn.com.pism.exception;

import lombok.Getter;

import static cn.com.pism.exception.DefaultErrorCode.SYSTEM_ERROR;

/**
 * @author perccyking
 * @since 24-08-24 17:07
 */
@Getter
public class PismException extends RuntimeException {

    private final ErrorCode errorCode;

    public PismException() {
        super();
        this.errorCode = SYSTEM_ERROR;
    }

    public PismException(String message) {
        super(message);
        this.errorCode = SYSTEM_ERROR;
    }

    public PismException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public PismException(String message, ErrorCode errorCode) {
        super(message != null && !message.isEmpty() ? message : errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public PismException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = SYSTEM_ERROR;
    }

    public PismException(Throwable cause) {
        super(cause);
        this.errorCode = SYSTEM_ERROR;
    }

    public PismException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

}
