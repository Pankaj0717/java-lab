import java.util.Scanner;
class Lsearch {
    boolean Lsearch(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("The integer element " + ele + " is found at index " + i);
                return true;
            }
        }
        return false;
    }

    boolean Lsearch(double arr2[], double ele) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == ele) {
                System.out.println("The double element " + ele + " is found at index " + i);
                return true;
            }
        }
        return false;
    }

    boolean Lsearch(char arr3[], char ele) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == ele) {
                System.out.println("The char element " + ele + " is found at index " + i);
                return true;
            }
        }
        return false;
    }
}

class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double[] arr2 = {1.6, 2.8, 3.0, 4.3, 5.6};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements to search:");
        int key1=s.nextInt();
        double key2=s.nextDouble();
        char key3=s.next().charAt(0);
        Lsearch search = new Lsearch();

        search.Lsearch(arr, key1);
        search.Lsearch(arr2,key2);
        search.Lsearch(arr3,key3);
    }
}
