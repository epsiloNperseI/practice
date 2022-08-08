package algorithms.euclid;

public class GreatestCommonDivisor {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        gcd(4851, 3003);//231
    }
}
