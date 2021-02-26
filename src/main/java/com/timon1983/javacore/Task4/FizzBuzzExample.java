package Task4;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzzExample {
    private int number;
    Semaphore semaphoreFizz;
    Semaphore semaphoreBuzz;
    Semaphore semaphoreFizzBuzz;
    Semaphore semaphoreNumber;

    public FizzBuzzExample(int n) {
        number = n;
        semaphoreFizz = new Semaphore(0);
        semaphoreBuzz = new Semaphore(0);
        semaphoreFizzBuzz = new Semaphore(0);
        semaphoreNumber = new Semaphore(1);
    }
    public void fizz(Runnable printFizz) {
        for (int i = 3; i <= number; i += 3) {
            try {
                semaphoreFizz.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printFizz.run();
            semaphoreNumber.release();
            if ((i + 3) % 5 == 0) {
                i += 3;
            }
        }
    }
    public void buzz(Runnable printBuzz){
            for (int i = 5; i <= number; i += 5) {
                try {
                    semaphoreBuzz.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printBuzz.run();
                semaphoreNumber.release();
                if ((i + 5) % 3 == 0) {
                    i += 5;
                }
            }
        }
    public void fizzbuzz(Runnable printFizzBuzz) {

        for(int i = 15 ; i <= number ; i += 15) {
            try {
                semaphoreFizzBuzz.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                printFizzBuzz.run();
            semaphoreNumber.release();
        }
    }
    public void number(IntConsumer printNumber) {
        for(int i = 1 ; i <= number ; i++) {
            try {
                semaphoreNumber.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 15 == 0 ){
                semaphoreFizzBuzz.release();
            }
            if (i % 5 == 0){
                semaphoreBuzz.release();
            }
            if (i % 3 == 0){
                semaphoreFizz.release();
            }
            else  {
                printNumber.accept(i);
                semaphoreNumber.release();
            }
        }
    }
}
