package com.ambition.fyzojcodesandbox.model;

import lombok.Data;

/**
 * @author Ambition
 * @date 2023/12/4 22:18
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;
}
