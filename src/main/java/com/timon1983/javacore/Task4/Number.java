package Task4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class Number implements Runnable{
    private FizzBuzz fizzBuzz;
    private CyclicBarrier cyclicBarrier;

    Number(CyclicBarrier cb, FizzBuzz fb) {
        cyclicBarrier = cb;
        fizzBuzz = fb;
        new Thread(this).start();
    }
    @Override
    public void run() {
        fizzBuzz.number();
        try {
            cyclicBarrier.await();
        }catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
