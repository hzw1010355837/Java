package cn.hzw.day03;

public interface DemoInterfaceAbs {
    public abstract void one (); // 在接口内定义抽象方法,修饰符public和abstract是两个固定关键字,可以省略
    void two (); // 省略写法(不推荐)
    public default void three() {
        // 接口中定义默认方法
    }
    public static void four() {
        // 接口中定义静态方法
    }
}
