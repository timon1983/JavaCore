package Task4;


import java.util.function.IntConsumer;


public class FizzBuzz2 {
    private int number;
    int num = 1;

    public FizzBuzz2(int n) {
        number = n;
    }

public synchronized void fizz(Runnable printFizz) {
    while(num <= number) {
        if(num % 3 == 0 && num % 5 != 0) {
            printFizz.run();
            num++;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    public synchronized void buzz(Runnable printBuzz) {
        while(num <= number) {
            if(num % 3 != 0 && num % 5 == 0) {
                printBuzz.run();
                num++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void fizzbuzz(Runnable printFizzBuzz){
        while(num <= number) {
            if(num % 5 == 0 && num % 3 == 0) {
                printFizzBuzz.run();
                num++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void number(IntConsumer printNumber){
        while(num <= number) {
            if(num % 3 != 0 && num % 5 != 0) {
                printNumber.accept(num);
                num++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
