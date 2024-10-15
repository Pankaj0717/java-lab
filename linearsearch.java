class lsearch {
    boolean lsearch(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("The integer element " + ele + " is found at index " + i);
                return true;
            }
        }
        return false;
    }

    boolean lsearch(double arr2[], double ele) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == ele) {
                System.out.println("The double element " + ele + " is found at index " + i);
                return true;
            }
        }
        return false;
    }

    boolean lsearch(char arr3[], char ele) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == ele) {
                System.out.println("The char element " + ele + " is found at index " + i);
                return true;
            }
        }
        System.out.println("The char element " + ele + " is not found");
        return false;
    }
}

class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double[] arr2 = {1.6, 2.8, 3.0, 4.3, 5.6};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

        lsearch search = new lsearch();

        search.lsearch(arr, 3);
        search.lsearch(arr2, 2.8);
        search.lsearch(arr3, 'e');
        search.lsearch(arr3, 'k');
    }
}
