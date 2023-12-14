package com.ambition.fyzojcodesandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessExample {
    public static void main(String[] args) {
        try {
            // 执行命令并创建进程
            Process process = Runtime.getRuntime().exec("ping www.baidu.com");

            // 获取进程的输入流
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // 读取进程的输出
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 等待进程执行完成
            int exitCode = process.waitFor();
            System.out.println("Exit Value: " + exitCode);

            // 关闭流
            reader.close();
            inputStream.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
