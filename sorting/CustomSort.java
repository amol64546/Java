

import java.util.*;
public class CustomSort {
    public static void main(String[] args){  
        
                    
        Integer a = 9, b = 3;     
         System.out.println(b.compareTo(b));   // {1,0,-1}
        


        String c = "9", d = "3";     
        System.out.println(c.compareTo(d));   // diff
        

       String[] str = {"10", "3" ,"31"};
          Arrays.sort(str, new Comparator<String>() {
              public int compare(String x, String y){
                     return (y+x).compareTo(x+y);
               }
           });        
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));   // using lamda function


        Integer[] arr = {4,3,9,7,0};  
             Comparator<Integer> comp =  new Comparator<Integer>() {
               public int compare(Integer x, Integer y){
                    return (y).compareTo(x);
                }
             };      
         Arrays.sort(arr, comp);   
  
          Arrays.sort(arr, (a,b) -> ( b.compareTo(a)));   // using lamda function
         
        
      
    }    
}
