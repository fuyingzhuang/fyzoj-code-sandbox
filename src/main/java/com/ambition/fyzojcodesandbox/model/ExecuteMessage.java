package com.ambition.fyzojcodesandbox.model;

import lombok.Data;

/**
 * @author Ambition
 * @date 2023/12/7 22:04
 * 进程执行信息
 */
@Data
public class ExecuteMessage {
    /**
     * 退出值
     */
    private Integer exitValue;

    /**
     * 信息
     */
    private String message;

    /**
     * 错误信息
     */

    private String errorMessage;
    /**
     * 时间
     */

    private Long time;
    /**
     * 内存
     */

    private Long memory;

}
