package Task4;

import java.util.concurrent.ConcurrentHashMap;

public class FizzBuzz {
    private int num;
    private int[] numbers;
    ConcurrentHashMap<Integer, String> resultNumbers = new ConcurrentHashMap<>();

    public FizzBuzz(int n) {
        num = n;
       numbers = initNumbArray(n);
    }

    public int[] initNumbArray(int num) {
        int[] arrayNumb = new int[num];
        for (int i = 0; i < num; i++) {
            arrayNumb[i] = i + 1;
        }
        return arrayNumb;
    }

    public void fizz() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 != 0) {
                resultNumbers.put(i+1, "fizz");
            }
        }
    }
    public void buzz() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 3 != 0) {
                resultNumbers.put(i + 1, "buzz");
            }
        }
    }
    public void fizzbuzz() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 3 == 0) {
                resultNumbers.put(i + 1, "fizzbuzz");
            }
        }
    }
    public void number() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 != 0 && numbers[i] % 5 != 0) {
                resultNumbers.put(i + 1, String.valueOf(numbers[i]));
            }
        }
    }
}





