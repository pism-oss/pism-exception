package cn.com.pism.exception;

/**
 * @author perccyking
 * @since 24-06-28 19:25
 */
public interface ErrorCode {
    /**
     * <p>
     * 获取错误代码
     * </p>
     * by perccyking
     *
     * @return {@link Integer} 错误代码
     * @since 24-08-23 17:00
     */
    Integer getCode();

    /**
     * <p>
     * 获取错误信息
     * </p>
     * by perccyking
     *
     * @return {@link String} 错误信息
     * @since 24-08-23 17:00
     */
    String getMsg();
}
