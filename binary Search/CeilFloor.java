

public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9};        
        int target = 4;
        int c = ceil(arr,target);   // insertion
        int f = floor(arr, target, 0, arr.length-1);  
        System.out.println(f+" "+c);
    }

    public static int ceil(int[] arr,int target){      
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
        return l;
    }

    public static int floor(int[] arr,int target,int l,int r){  
        if(l>r) 
            return r;  

        int mid  = l+(r-l)/2;

        if(target<arr[mid])
            return floor(arr, target, l, mid-1);
        if(target>arr[mid])
            return floor(arr,target, mid+1, r);
        
        return mid;


    }
}

public static int[] floorAndCeil(int target, int[] arr) {
    int n = arr.length;       
    int[] ans = new int[2];     
    int l=0, r=n-1; 
    while(l<=r){                
            int mid = l+(r-l)/2;            
            if(arr[mid]>target){
                r=mid-1;
            }else if(arr[mid]<target){                               
                l = mid+1;
            }else{
                Arrays.fill(ans,arr[mid]);                        
                return ans;
            }
        }   
    ans[0] = (r==-1) ? -1:arr[r];   
    ans[1] = (l==n) ?  -1:arr[l];           
    return ans;
       
}
