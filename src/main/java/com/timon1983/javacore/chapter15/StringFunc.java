package main.java.com.timon1983.javacore.chapter15;

public interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2{
    public static void main(String[] args) {
        StringFunc revers = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Лямбда обращается на " + revers.func("Лямбда"));
        System.out.println("Выражение обращается на " + revers.func("Выражение"));
    }
}
