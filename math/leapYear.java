
import java.util.*;
import java.io.*;

public class leapYear {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter\n");
      int year = s.nextInt();

      if (year % 4 == 0) {
         if (year % 100 == 0) {
            if (year % 400 == 0) {
               System.out.print("It is leap year");
            } else {
               System.out.print("It is not leap year");
            }
         } else {
            System.out.print("It is leap year");
         }
      } else {
         System.out.print("It is not leap year");
      }

      // if((year%4==0) && ((year%400==0) || (year%100==0))){
      // System.out.print("It is leap year");
      // }
      // else{
      // System.out.print("It is not leap year");
      // }

   }
}
