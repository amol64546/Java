

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int target = 2;
        // int index = binarySearch(arr,target);
        int index = RecBinarySearch(arr, target, 0, arr.length-1);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr,int target){      
        int l=0, r=arr.length-1;         
        while(l<=r){
            int mid  = l+(r-l)/2;
            if(target<arr[mid]){
                r = mid - 1;
            }else if(target>arr[mid]){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int RecBinarySearch(int[] arr,int target,int l,int r){  
        if(l>r) 
            return -1;  

        int mid  = l+(r-l)/2;

        if(target<arr[mid])
            return RecBinarySearch(arr, target, l, mid-1);
        if(target>arr[mid])
            return RecBinarySearch(arr,target, mid+1, r);
        
        return mid;


    }
}
