package cn.hzw.day03;

public class DemoInterfaceAbsImpl implements DemoInterfaceAbs { // 创建实现类
    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }

}
