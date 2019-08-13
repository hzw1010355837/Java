package cn.hzw.day04;

import org.jetbrains.annotations.Contract;

public class Outer {
    static int num = 10;
//    private int num = 0;

//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }

    public static class Inner {
        int num = 20;
        public void method () {
            int num = 30;
            System.out.println(num);  // 局部变量
            System.out.println(this.num); // 本类类变量
            System.out.println(Outer.num); // 外部类成员变量
        }
    }
    static void method() {
        System.out.println("haha");
    }

    public static void main(String[] args) {

    }
}
