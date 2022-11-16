
import java.util.*;
import java.io.*;

public class factorial {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      long f = 1;
      for (int i = 1; i <= n; i++) {
         f *= i;
      }
      System.out.print(f);

   }
}
