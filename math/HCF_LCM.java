import java.util.*;
import java.io.*;

public class HCF {

   public static int gcd(int a, int b){            
     if(b==0)  return a;          
     return gcd1(b, a%b);
   }

    public static int gcd2(int a, int b){
      int hcf = Math.min(a,b);      
      while(hcf>0){
          if(a%hcf==0 && b%hcf==0){
             break;
          }
          hcf--;
      }
        int lcm = (a*b) / hcf;
    System.out.print(hcf +" "+ lcm);
    }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
	  gcd2(a,b);
   }
}
