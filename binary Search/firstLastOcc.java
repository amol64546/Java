
public class firstLastOcc {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,5,8};
        int target = 5;
        Solution obj = new Solution();
        int[] ans = obj.searchRange(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;   
        if(nums.length==0 || nums[0]>target || nums[n-1]<target)
            return new int[]{-1,-1};

        int[] ans = new int[2];             
        ans[0] = firstOcc(nums,target,0,n-1);
        ans[1] = lastOcc(nums,target,0,n-1);
        return ans;
    }

     public int lastOcc(int[] nums, int target,int l, int r){  
         if(nums[r]==target)    return r; 
       while(l<=r){
           int mid = l+ (r-l)/2;
           if(nums[mid]==target && target<nums[mid+1])
                return mid;                        
           else if(nums[mid]>target)
               r = mid-1;
           else
              l = mid+1;           
       }
       return -1;

    }

    public int firstOcc(int[] nums, int target,int l, int r){    
        if(nums[l]==target) return l;   
       while(l<=r){
           int mid = l+ (r-l)/2;
           if(nums[mid]==target && nums[mid-1]<target)
               return mid;                   
           else if(nums[mid]<target)
               l = mid+1;
           else            
                r = mid-1;           
       }
       return -1;

    }
}
