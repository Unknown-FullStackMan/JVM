package com.simple.jvm.java.lang;

/**
 * @Author Simple
 * @Date 2022/2/20
 */
public class String {
    /**
     * 包、路径不重复，引用java.lang.String，不会报错
     * @param args
     */
    public static void main(java.lang.String[] args) {
        System.out.println(1);
    }
    /**
     * 包、路径不重复，引用String，直接无法编译
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("自定义String");
    }
}
