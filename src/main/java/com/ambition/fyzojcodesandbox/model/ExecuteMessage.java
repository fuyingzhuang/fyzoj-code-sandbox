package com.ambition.fyzojcodesandbox.model;

import lombok.Data;

/**
 * @author Ambition
 * @date 2023/12/7 22:04
 * 进程执行信息
 */
@Data
public class ExecuteMessage {
    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;

}
