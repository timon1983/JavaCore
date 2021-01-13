package main.java.com.timon1983.javacore.chapter15;

public interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo{
    public static void main(String[] args) {
        SomeFunc<String> revers = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Лямбда обращается на " + revers.func("Лямбда"));
        System.out.println("Выражение обращается на " + revers.func("Выражение"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
    }
}
