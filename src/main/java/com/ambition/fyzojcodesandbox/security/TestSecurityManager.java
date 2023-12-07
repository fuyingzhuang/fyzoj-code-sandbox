package com.ambition.fyzojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.Charset;

/**
 * @author Ambition
 * @date 2023/12/7 22:21
 */
public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}

