package Task4;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CyclicBarrier;

public class FizzBuzzMain {
    public static void main(String[] args) {

            FizzBuzz fb = new FizzBuzz(45);
            CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {

                @Override
                public void run() {
                    TreeMap<Integer, String> sorted = new TreeMap<>();
                    sorted.putAll(fb.resultNumbers);
                    for(Map.Entry<Integer, String> result : sorted.entrySet()){
                        System.out.print(result.getValue() + ", ");
                }
            }
            });

            new Fizz(cb, fb);
            new Buzz(cb, fb);
            new FizzAndBuzz(cb, fb);
            new Number(cb, fb);
        }
}


