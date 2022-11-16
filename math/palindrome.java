import java.util.*;
import java.io.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int copy = a;
        int reverse = 0;
        while (a != 0) {
            reverse = reverse * 10 + a % 10;
            a /= 10;
        }

        if (copy == reverse)
            System.out.print("It is palindrome no");
        else
            System.out.print("It is not palindrome no");

    }
}
