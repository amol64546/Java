

public class MinMax {

    public static int[] findMinMax(int[] arr) {
        int l = 0, r = arr.length - 1;
        int n = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] < arr[r]) {
                r = mid;
            } else if (arr[mid] > arr[r]) {
                l = mid + 1;
            } else { // arr[mid] == arr[r], can't determine side, shrink right
                r--;
            }
        }

        int minIndex = l;
        int min = arr[minIndex];
        int max = arr[(minIndex - 1 + n) % n]; // max will be on left // +n)%n for rotated

        return new int[]{min, max};
    }
    
    public static int findMin(int[] arr) {
        int l=0, r=arr.length-1;    
        
        // min value wil be in 2nd subarr
        
        while(l<r){
            int mid  = l+(r-l)/2;
            if(arr[mid]>arr[r]){    // shrink 1st part from left
                l = mid + 1;                
            }else if(arr[mid]<arr[r]){    //shrink 2nd part from right
                r = mid;                  // so mid could be min
            }
        }
        return arr[l];   // l==r==min
    }

    public static int findMax(int[] arr) {
        int l=0, r=arr.length-1;    
        
        // max value wil be in 1nd subarr
        
        while(l<r){
            int mid  = l+(r-l)/2;
            if(arr[r]<arr[mid]){    // mid lies in 1st subarr
                l = mid ;          // so mid could be max      
            }else if(arr[r]>arr[mid]){    //  mid lies in 2nd subarr
                r = mid-1;                  
            }
        }
        return arr[l];   // l==r==max
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int min=findMin(arr);
        int max=findMax(arr);
        System.out.println(min+" "+max);
    }
}
