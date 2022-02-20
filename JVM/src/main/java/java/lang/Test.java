package java.lang;

/**
 * @Author Simple
 * @Date 2022/2/20
 */
public class Test {
    /**
     * 包、路径重复，引用String，
     * 报错 Prohibited package name: java.lang
     * Error: A JNI error has occurred, please check your installation and try again
     * @param args
     *
     * 原因：由于双亲委派模型机制，preDefineClass方法首先对类名进行了检查，发现以java作为一级包名，则抛出安全异常：禁止使用的包名！
     * 那为什么自定义的String类运行main方法报的是另外的一个错误呢？？
     * 因为String类本身就在java.lang.包中找得到，只是找到的类不是自定义的String，所以没有main方法的错误。
     * 而这个Test类，本身在java开头的包中找不到，然后在preDefineClass方法首先对类名进行了检查，直接报错。
     */
    public static void main(String[] args) {
        System.out.println("test 自定义 String");
    }
}
