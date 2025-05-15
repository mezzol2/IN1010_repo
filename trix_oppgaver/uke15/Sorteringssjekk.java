public class Sorteringssjekk {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange"};

        System.out.println(erSortert(words));
        System.out.println(isSortedRecursively(words));
    }

    public static boolean erSortert(String[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i].compareTo(A[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedRecursively(String[] A){
        int i = 0;

        return recursiveCheck(A,i);
    }

    public static boolean recursiveCheck(String[] A, int i){
        if (i == A.length-1){
            return true;
        } else if (A[i].compareTo(A[1+i]) > 0){
            return false;
        }

        return recursiveCheck(A, i+1);
    }
}