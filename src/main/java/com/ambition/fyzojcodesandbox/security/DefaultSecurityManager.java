package com.ambition.fyzojcodesandbox.security;

import java.security.Permission;

/**
 * @author Ambition
 * @date 2023/12/7 22:19
 * 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
//        super.checkPermission(perm);
    }
}
