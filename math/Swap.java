import java.util.*;
import java.lang.*;
import java.io.*;

public class Swap
 
{
       static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int a = 2;	
        int b = 4;
         System.out.println(a +" "+ b);
        
        // int temp = a;
        //     a = b;
        //     b = temp;
        
        // numbers
        // a = a + b;
        // b = a - b;
        // a = a - b;

//a = (a+b) - (b=a)
        
        // numbers
         a = a ^ b;        
         b = a ^ b;
         a = a ^ b;
        
        System.out.print(a +" "+ b);
        
         
          
	}
    
    
}
