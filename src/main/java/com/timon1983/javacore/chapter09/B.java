package main.java.com.timon1983.javacore.chapter09;

public class B implements A.NestedIF{
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
