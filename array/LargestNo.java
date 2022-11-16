package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNo
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s[]=new String[n];

      for(int i=0;i<n;i++) 
            s[i]=sc.next();

      Arrays.sort(s,(s1,s2) -> (s2+s1).compareTo(s1+s2));

      StringBuilder ans = new StringBuilder("");
        for(int i=0; i<n; i++)
          ans.append(s[i]);
        
      System.out.print(ans);
	}
}
