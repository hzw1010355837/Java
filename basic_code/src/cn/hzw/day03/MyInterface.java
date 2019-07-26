package cn.hzw.day03;

public class MyInterface {
    public static void main(String[] args) {
        DemoInterfaceAbsImpl inter = new DemoInterfaceAbsImpl();
        inter.one();
        inter.two();
        DemoInterfaceAbs.four(); // 调用接口内的静态方法
    }
}
