package com.ambition.fyzojcodesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author Ambition
 * @date 2023/12/4 22:17
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeRequest {

    /**
     * 输入
     */
    private List<String> inputList;


    /**
     * 代码
     */
    private String code;

    /**
     * 语言
     */
    private String language;
}

