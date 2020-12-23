package Task2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSearch {
    boolean searchDuplcateElements(int[] a) {
        Set<Integer> unic = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            unic.add(a[i]);
        }
        if(a.length > unic.size())
            return true;
        else
            return false;
    }
}

class Test{
    public static void main(String[] args) {
        int [] array = {8,3,5,2,7,51,8};
        DuplicateSearch ds = new DuplicateSearch();
        System.out.println(ds.searchDuplcateElements(array));
    }
}
