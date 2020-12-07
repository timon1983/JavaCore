package main.java.com.timon1983.javacore.chapter09;

public class MyIFImp implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }
    int defNum = MyIF.getDefaultNumber();
}
