import java.util.*;


public class DecToBinary    
{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	  // decimalToBinary();
      binaryToDecimal();
	  
	}
    public static void decimalToBinary(){
        int d=sc.nextInt();
        String b="";
        while(d>0){
            b = (d%2) + b;
            d/=2;                     
        }
        System.out.print(b); 
    }
    public static void binaryToDecimal(){
        String b = sc.next();             
        int d=0, n = b.length();
        for(int i=0; i<n; i++){
            int bit = b.charAt(n-i-1)-'0';            
            d+= Math.pow(2,i)* bit;            
        }
        System.out.print(d); 
    }
}
