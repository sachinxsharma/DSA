public class Maths1 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        int c = 2;
        // hence only make chekcks for no's sqrt(n)
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;// falese to then aage ke checks karega 3,4,5,6,7 wagera wagera

        }
        // if trkue return
        return true;

    }

}
