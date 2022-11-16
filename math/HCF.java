import java.util.*;
import java.io.*;

public class HCF {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
	  
	  
	  // from backward
      int hcf = Math.min(a,b);      
      while(hcf>0){
          if(a%hcf==0 && b%hcf==0){
             break;
          }
          hcf--;
      }

	 // from forward
	//  int hcf=0;
	// 	for(int i=1; i<=Math.min(a,b); i++ ){
	// 	    if(a%i==0 && b%i==0){
	// 			hcf=i;
	// 		}
	//  	}
		
	  System.out.print(hcf);


     
     

   }
}
