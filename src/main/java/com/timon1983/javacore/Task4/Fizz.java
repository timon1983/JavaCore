package Task4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class Fizz implements Runnable{
        private FizzBuzz fizzBuzz;
        private CyclicBarrier cyclicBarrier;

        Fizz( CyclicBarrier cb, FizzBuzz fb) {
            cyclicBarrier = cb;
            fizzBuzz = fb;
            new Thread(this).start();
        }
        @Override
        public void run() {
            fizzBuzz.fizz();
            try {
                cyclicBarrier.await();
            }catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }
