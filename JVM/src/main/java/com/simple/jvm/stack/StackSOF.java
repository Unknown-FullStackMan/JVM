package com.simple.jvm.stack;

/**
 * @Author Simple
 * @Date 2022/2/14
 * 模拟栈内存溢出
 */
public class StackSOF {
    /**
     * 栈的深度
     */
    private int stackDeep = 1;

    /**
     * 递归调用
     */
    public void stackLeak() {
        stackDeep ++ ;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackSOF oom = new StackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e) {
            System.out.println("stack deep: "+ oom.stackDeep);
            throw e;
        }
    }
}
