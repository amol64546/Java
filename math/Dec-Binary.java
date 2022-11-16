import java.util.*;


public class DecToBinary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Decimal to binary no
      Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  // int ans = decToBinary(n);
      int ans = binaryToDec(n);
	  System.out.print(ans);   
	  
	}
    public static int decToBinary(int dec){
        int binary=0, i=1;
        while(dec>0){
            binary += (dec%2) * i;
            dec/=2;
            i*=10;            
        }
        return binary;
    }
    public static int binaryToDec(int binary){
        int dec=0, i=0;
        while(binary>0){
            dec+= Math.pow(2,i++)* (binary%10);
            binary/=10;
        }
        return dec;
    }
}
