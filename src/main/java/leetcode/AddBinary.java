package leetcode;

public class AddBinary {

    public String addBinary(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int maxLength = Math.max(len1, len2);
        char[] result = new char[maxLength];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < len1 ? Character.getNumericValue(arr1[len1 - 1 - i]) : 0;
            int digit2 = i < len2 ? Character.getNumericValue(arr2[len2 - 1 - i]) : 0;
            int sum = digit1 + digit2 + carry;
            result[maxLength - 1 - i] = (char) (sum % 2 + '0');
            carry = sum / 2;
        }

        if (carry > 0) {
            return "1" + new String(result);
        } else {
            return new String(result);
        }
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary(a, b);
        System.out.println(result);
        System.out.println(Integer.parseInt(result, 2));
    }

}
