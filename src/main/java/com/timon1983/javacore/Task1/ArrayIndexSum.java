package Task1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIndexSum {

    int[] indexSum(int number, int[] c) {
        int[] result = new int[2];
        Integer[] a = new Integer[c.length];
        Map<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            a[i] = c[i];
            if (elements.containsKey(c[i])) {
                result[0] = Arrays.asList(a).indexOf(elements.get(c[i]));
                result[1] = i;
            } else
                elements.put(number - c[i], c[i]);
        }
        return result;
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