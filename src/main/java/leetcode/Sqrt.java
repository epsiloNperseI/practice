package leetcode;

public class Sqrt {

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(225));
        System.out.println(sqrt.mySqrt(25));

        }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        long i = x;
        while(i > x / i)
            i = (i + x / i) / 2;
        return (int)i;
    }

}
