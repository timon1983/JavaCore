package main.java.com.timon1983.javacore.chapter07;

public class VarArgs4 {
    static void vaTest(int... v){
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(boolean... v){
        System.out.print("vaTest(boolean...): " + "Количество аргументов: " + v.length + " Содержимое: ");
        for(boolean x: v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);
        //vaTest();ERROR!
    }
}
