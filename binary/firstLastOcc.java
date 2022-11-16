
public class firstLastOcc {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,5,8};
        int target = 5;
        int f = firstOcc(arr, target, 0, arr.length-1);
        int l = lastOcc(arr, target, 0, arr.length-1);
        System.out.println(f+" "+l);
    }
    public static int firstOcc(int[] arr, int target, int l, int r){        
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target==arr[mid]){
                if(mid == 0 || arr[mid-1]<arr[mid]){
                    return mid;
                }else{
                    r = mid-1;
                }
            }else if(target<arr[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;


    }
    public static int lastOcc(int[] arr, int target, int l, int r){   
        int ans = -1;     
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target==arr[mid]){
                ans = mid;
                l = mid+1;
            }else if(target<arr[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;

    }
}
