package Task1;

import java.util.Arrays;

public class ArrayIndexSum {

    void indexSum(int number , int [] c) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                int sum = c[i] + c[j];
                if (number == sum) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        System.out.println("array = " + Arrays.toString(c) + ", Number = " + number);
        System.out.println("result = [" + index1 + ", " + index2 + "]");
    }
}

class Test{
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17, 6, 9, 5, 35, 14};
        int number = 52;
        ArrayIndexSum ais = new ArrayIndexSum();
        ais.indexSum(number, array);
    }
}