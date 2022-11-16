
import java.util.*;
import java.io.*;

public class SumOfNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = (n*(n+1))/2 ;

        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.print(sum);
    }
}