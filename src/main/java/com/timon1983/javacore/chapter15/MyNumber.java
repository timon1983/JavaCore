package main.java.com.timon1983.javacore.chapter15;

public interface MyNumber {
    double getValue();
}

class LambdaDemo{
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());

        //myNum = () -> "123.03";ОШИБКА
    }
}
