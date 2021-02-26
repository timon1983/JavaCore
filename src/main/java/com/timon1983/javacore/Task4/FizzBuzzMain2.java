package Task4;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntConsumer;

public class FizzBuzzMain2  {
    public static void main(String[] args){

        FizzBuzz2 fb = new FizzBuzz2(20);
        IntConsumer printNumber = number -> System.out.print(number + ", ");
        Runnable printFizz = ()-> System.out.print("fizz" + ", ");
        Runnable printBuzz = ()-> System.out.print("buzz" + ", ");
        Runnable printFizzBuzz = ()-> System.out.print("fizzbuzz" + ", ");

        Thread thread1 = new Thread(() -> {
            try {
                fb.fizz(printFizz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                fb.buzz(printBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                fb.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                fb.number(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread4.start();
        thread3.start();
        thread2.start();
        thread1.start();
    }
}
