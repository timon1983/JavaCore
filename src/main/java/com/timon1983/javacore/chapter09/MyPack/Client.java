package main.java.com.timon1983.javacore.chapter09.MyPack;

public class Client implements CallBack {
    @Override
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы, " + "могут определяться и другие члены");
    }
}
