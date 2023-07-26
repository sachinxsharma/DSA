package Recursion;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(sorted(arr, 0));

    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; ///// agar index end m aata h to return true its mean its sorted yk..

        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
