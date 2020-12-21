package Task2;

public class DuplicateSearch {
    boolean searchDuplcateElements(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    return true;
            }
        }
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
