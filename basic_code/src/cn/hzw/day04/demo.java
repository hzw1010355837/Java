package cn.hzw.day04;

public class demo extends Outer {
    public static void main(String[] args) {
        System.out.println(num);
        method();
        Outer ot = new Outer();
        method();  // 本质上还是类在调用 Outer.method() or demo.method() or method()
    }
}
