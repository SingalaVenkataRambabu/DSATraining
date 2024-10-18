public class AsciToInteger {

    public static void main(String [] args){

        String str1 = "123";
        String str2 = "   -56";
        String str3 = "12a3";

        System.out.println("Converted number: " + myAtoI(str1));
        System.out.println("Converted number: " + myAtoI(str2));
        System.out.println("Converted number: " + myAtoI(str3));

    }
    public static int myAtoI(String str) {
        str = str.trim();

        int sign = 1;
        int result = 0;
        int index = 0;
        int length = str.length();

        if (index < length) {
            char firstChar = str.charAt(index);
            if (firstChar == '-') {
                sign = -1;
                index++;
            } else if (firstChar == '+') {
                index++;
            }
        }

        while (index < length) {
            char currentChar = str.charAt(index);
            if (currentChar < '0' || currentChar > '9') {
                return -1;
            }
            int digit = currentChar - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;

    }
}
