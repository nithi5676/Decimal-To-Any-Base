package decimalToAnyBase;

import java.util.Scanner;

public class DecimailToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter the value: ");
        int number = scanner.nextInt();
        System.out.print(" enter the Base number: ");
        int base = scanner.nextInt();
        scanner.close();
        System.out.println(convertion(number, base));
    }

    public static String convertion(int number, int base) {
        if (number == 0) {
            return "0";
        } else {
            String result = "";
            while (number > 0) {
                // char digit=Character.forDigit((number%base),16);//converting to hexadecimal
                int temp = number % base;
                result += temp + "";
                number /= base;
            }
            StringBuilder sb = new StringBuilder(result);
            sb.reverse();
            return sb.toString();
        }
    }

}
