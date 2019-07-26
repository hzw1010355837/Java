package cn.hzw.day01;

public class DemoClass {

    public static void main(String[] args) {
        Student one = new Student("zs", 1);
        Student.room = "101";
        Student two = new Student("ls", 2);
//        one.setName("zs");
        System.out.println(Student.room);
    }
}
