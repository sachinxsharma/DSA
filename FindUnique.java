public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4, 6, 9 };
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {

        int unique = 0;

        for (int n : arr) {
            unique ^= n;
            // XOR with the previous number to get only distinct numbers in array and then
            // add them up at
            // observation

            // a^1= a(opposite)
            // a^0= a
            // a^a=0

        }
        return unique;
    }
}
