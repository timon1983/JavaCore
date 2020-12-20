package Task2;

import java.util.Arrays;

public class DuplicateSearch {

    void searchDuplcateElements(int[] a) {
        int element = 0;
        int count = 1;
        boolean result;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count > 1){
                element = a[i];
                result = true;
                System.out.println("Array: " + Arrays.toString(a) + "\n" + "Result: " + result + "\n" +
                        "Число " + element + " повторяется " + count + " раза");
                break;
            }
        }

        if(count == 1) {
            result = false;
            System.out.println("Array: " + Arrays.toString(a) + "\n" + "Result: " + result + "\n" +
                    "Дубликатов нет");
        }
    }
}

class Test{
    public static void main(String[] args) {
        int [] array = {8,3,5,2,5,5,5};
        DuplicateSearch ds = new DuplicateSearch();
        ds.searchDuplcateElements(array);

    }
}
