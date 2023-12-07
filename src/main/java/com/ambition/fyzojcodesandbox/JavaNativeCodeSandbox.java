package com.ambition.fyzojcodesandbox;

import com.ambition.fyzojcodesandbox.model.ExecuteCodeRequest;
import com.ambition.fyzojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @author Ambition
 * @date 2023/12/7 22:11
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
