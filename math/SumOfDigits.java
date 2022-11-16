
import java.util.*;
import java.io.*;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;

    while (n > 0) {
      int digit = n % 10;
      sum = sum + digit;
      n = n / 10;
    }
    System.out.print(sum);

  }
}
