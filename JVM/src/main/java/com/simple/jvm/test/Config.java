package com.simple.jvm.test;

/**
 * @Author Simple
 * @Date 2022/2/14
 */
public class Config {

    /**
     * 类变量 GcRoot
     */
    public static Manager manager = new Manager();
    /**
     * 实例变量
     */
     private int a;

    public String loadData() {
        return "abc";
    }
}
