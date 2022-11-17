public class BinaryS {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{123,30,34,60}};
        int target = 11;
        Solution obj = new Solution();
        System.out.println(obj.searchMatrix(matrix,target));
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        
        int min=0, max=m*n -1;
        while(min<=max){
            int mid=(min+max)/2;
            int r = mid/n;
            int c = mid%n;
            
            if(target<matrix[r][c]){
                max=mid-1;
            }else if(matrix[r][c]<target){
                min=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
