package com.simple.jvm.test;

import java.io.IOException;

/**
 * @Author Simple
 * @Date 2022/2/14
 */
public class Application {
    /**
     * main线程 -->main的线程栈 也就是虚拟机栈
     * @param args
     */
    public static void main(String[] args) throws IOException {
        load();
        /** 程序不要退出 **/
        System.in.read();
    }
    public static void load() {
        // GcRoot
        Config config = new Config();
        config.loadData();
    }
}
