package main.java.com.timon1983.javacore.chapter07;

public class OverloadDemo {
    void test(){
        System.out.println("Параметры отсутствуют");
    }

//    void test(int a){
//        System.out.println("a: " + a);
//    }

    void test(int a, int b){
        System.out.println("a и b" + a + " " + b);
    }

    float test(float a){
        System.out.println("double a: " + a);
        return a*a;
    }

    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

class Overload{
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
       // od.test(10);
        od.test(10, 20);
        result = od.test(123.25f);
        System.out.println("Результат вызова ob.test(123.25): " + result);

        OverloadDemo od1 = new OverloadDemo();
        int i = 88;

        od1.test();
        od1.test(10, 20);

        od.test(i);
        od1.test(123.2);
    }
}
