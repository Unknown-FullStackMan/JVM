package java.lang;

/**
 * @Author Simple
 * @Date 2022/2/20
 */
public class String {
    /**
     * 包、路径重复，引用String，报错！
     * 错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
     *    public static void main(String[] args)
     * 否则 JavaFX 应用程序类必须扩展javafx.application.Application
     *
     * 原因：由于双亲委派模型机制，代码运行时会找到java.lang.String 类，但是java.lang.String 中没有main方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1);
    }
}
