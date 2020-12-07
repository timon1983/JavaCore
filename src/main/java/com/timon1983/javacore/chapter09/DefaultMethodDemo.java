package main.java.com.timon1983.javacore.chapter09;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        MyIFImp2 obj2 = new MyIFImp2();
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
