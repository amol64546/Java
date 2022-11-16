

public class searching {

     public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 5;
       
        int ans = binarySearch(arr,target);
        
        System.out.println(ans);
    }
    

    public static int binarySearch(int[] arr,int k){      
       int l=0, r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k) return mid;
            
            // left part is sorted
            if(arr[l]<=arr[mid]){
                if(arr[l]<=k && k<arr[mid]){  // target in range
                    r=mid-1;   
                }else{               // target in right part
                    l=mid+1;
                }
            }
            // right part is sorted
            else{
                if(arr[mid]<k && k<=arr[r]){  // target in range
                    l=mid+1;
                }else{                  // target in left part
                    r=mid-1;
                }
            }
        }
        return -1;
    }


    

   
}
