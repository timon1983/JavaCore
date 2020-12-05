package main.java.com.timon1983.javacore.chapter07;

public class Test {
    int a, b;
    int c;
    public int d;
    private int e;

    void setE(int i){
        e = i;
    }
    int getE(){
        return e;
    }

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }

    Test(){}

    Test(int i, int j){
        a = i;
        b = j;
    }

    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }

    boolean equals(Test o){
        if(o.a == a &&  o.b == b) return true;
        else return false;
    }
}
