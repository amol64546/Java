import java.util.*;
import java.lang.*;
import java.io.*;

public class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
        ;
       long a = 10, b=2;
       int n= (int) 10e9+7;
       // 10e9 -> double
        
        System.out.print(fastPow(a,b,n));
    }
    //(a+b)%n = (a%n + b%n) %n
    //(a*b)%n = (a%n * b%n) %n
    
    public static long fastPow(long a, long b, int n){
        long res = 1;
        while(b>0){
            if((b&1)!=0)
                res = (res * a%n) %n;
            a = (a%n * a%n) %n;
            b>>=1;
        }
        return res;
    }
}

