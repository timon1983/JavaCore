package main.java.com.timon1983.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exceptoin.");
//        } catch (ArithmeticException e){
//            System.out.println("Этот код вообще недостижим.");
//        }
        }
    }
}
