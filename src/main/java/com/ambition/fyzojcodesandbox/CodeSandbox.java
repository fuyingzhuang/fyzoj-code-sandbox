package com.ambition.fyzojcodesandbox;

import com.ambition.fyzojcodesandbox.model.ExecuteCodeRequest;
import com.ambition.fyzojcodesandbox.model.ExecuteCodeResponse;

/**
 * @author Ambition
 * @date 2023/12/7 22:10
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest 执行代码请求
     * @return 执行代码响应
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
