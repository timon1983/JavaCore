package main.java.com.timon1983.javacore.chapter15;

public interface MyFunc {
    int func(int n);
}

class VarCapture{
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            //num++;Error
            return v;
        };
        //num = 9;Error
    }
}