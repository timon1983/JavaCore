package Task4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FizzAndBuzz implements Runnable{
        private FizzBuzz fizzBuzz;
        private CyclicBarrier cyclicBarrier;

        FizzAndBuzz( CyclicBarrier cb,FizzBuzz fb) {
                cyclicBarrier = cb;
                fizzBuzz = fb;
                new Thread(this).start();
        }
        @Override
        public void run() {
                fizzBuzz.fizzbuzz();
            try {
                cyclicBarrier.await();
            }catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
}
