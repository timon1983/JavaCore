package Task4;


import java.util.function.IntConsumer;

public class FizzBuzzMain2  {
    public static void main(String[] args) {

        FizzBuzz2 fb = new FizzBuzz2(20);

        IntConsumer printNumber = number -> System.out.print(number + ", ");
        Runnable printFizz = ()-> System.out.print("fizz" + ", ");
        Runnable printBuzz = ()-> System.out.print("buzz" + ", ");
        Runnable printFizzBuzz = ()-> System.out.print("fizzbuzz" + ", ");

        Thread thread1 = new Thread(() -> {
            fb.fizz(printFizz);
        });

        Thread thread2 = new Thread(() -> {
            fb.buzz(printBuzz);
        });

        Thread thread3 = new Thread(() -> {
            fb.fizzbuzz(printFizzBuzz);
        });

        Thread thread4 = new Thread(() -> {
            fb.number(printNumber);
        });

        thread4.start();
        thread3.start();
        thread2.start();
        thread1.start();
    }
}
