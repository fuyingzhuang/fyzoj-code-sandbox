package com.ambition.fyzojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ambition
 * @date 2023/12/7 22:22
 * 无限占用空间（浪费系统内存）
 */
public class MemoryError {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[10000]);
        }
    }
}

