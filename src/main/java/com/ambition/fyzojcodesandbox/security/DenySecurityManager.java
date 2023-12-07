package com.ambition.fyzojcodesandbox.security;

import java.security.Permission;

/**
 * @author Ambition
 * @date 2023/12/7 22:20
 * 拒绝所有的权限
 */
public class DenySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}
