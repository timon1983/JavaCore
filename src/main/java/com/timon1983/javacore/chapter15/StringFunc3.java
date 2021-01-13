package main.java.com.timon1983.javacore.chapter15;

public interface StringFunc3 {
    String func(String n);
}

class MyStringOps{
    static String strReverse(String str){
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }

    String strReverse2(String str){
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodDemo{
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
        MyStringOps mso = new MyStringOps();
        outStr = stringOp(mso::strReverse2,inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
