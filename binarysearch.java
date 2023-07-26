package datatypes;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);// called the recursion method again nd again
        }
        return search(arr, target, m + 1, e);
    }
}