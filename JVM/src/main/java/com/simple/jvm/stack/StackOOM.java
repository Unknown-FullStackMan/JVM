package com.simple.jvm.stack;

/**
 * @Author Simple
 * @Date 2022/2/14
 * 模拟栈内存不足
 */
public class StackOOM {

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    while (true) {

                    }
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        StackOOM stackOOM = new StackOOM();
        stackOOM.stackLeakByThread();
    }
}
