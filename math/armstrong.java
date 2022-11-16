import java.util.*;
import java.io.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int copy = a;
        int cube = 0;
        while (a > 0) {
            int digit = a % 10;
            cube += digit * digit * digit;
            a /= 10;
        }

        if (copy == cube)
            System.out.print("It is armstrong no");
        else
            System.out.print("It is not armstrong no");

    }
}
