package Task1;

import java.util.Arrays;

public class ArrayIndexSum {

    int[] indexSum(int number, int[] c) {
        int[] result;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (number == c[i] + c[j]) {
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return null;
    }
}

class Test{
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17, 6, 9, 5, 35, 14};
        int number = 52;
        ArrayIndexSum ais = new ArrayIndexSum();
        System.out.println(Arrays.toString(ais.indexSum(number, array)));
    }
}