package Task4;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;


public class FizzBuzz2 {
    private int number;
    int num = 1;

    public FizzBuzz2(int n) {
        number = n;
    }

public synchronized void fizz(Runnable printFizz) throws InterruptedException {
    while(num <= number) {
        if(num % 3 == 0 && num % 5 != 0) {
            printFizz.run();
            num++;
            notifyAll();
        } else {
            wait();
        }
    }
}
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while(num <= number) {
            if(num % 3 != 0 && num % 5 == 0) {
                printBuzz.run();
                num++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(num <= number) {
            if(num % 5 == 0 && num % 3 == 0) {
                printFizzBuzz.run();
                num++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while(num <= number) {
            if(num % 3 != 0 && num % 5 != 0) {
                printNumber.accept(num);
                num++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
