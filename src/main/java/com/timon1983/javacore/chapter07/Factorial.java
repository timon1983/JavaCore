package main.java.com.timon1983.javacore.chapter07;

public class Factorial {
    int fact1(int n){
        int result;

        if(n==1) return 1;
        result = fact1(n-1) * n;
        return result;
    }
}

