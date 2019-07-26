package cn.hzw.day02;

public class Zi extends Fu {
    public Zi() {
        System.out.println("子类构造方法被调用!");
    }
    @Override
    public void eat() {
        System.out.println("儿子吃!");
    }
}
