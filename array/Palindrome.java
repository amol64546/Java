package array;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[n - i - 1];
        }

        // boolean flag = false;
        // for (int i = 0; i < n; i++) {
        // flag = false;
        // if (newArr[i] == arr[i]) {
        // flag = true;
        // }
        // }

        // String flag = "Palindrome";
        // for (int i = 0; i < n; i++) {
        // if (newArr[i] != arr[i]) {
        // flag = "Not palindrome";
        // }
        // }
        // System.out.print(flag);

        if (Arrays.equals(arr, newArr)) { // arr == newArr
            System.out.print("palindrome");
        } else {
            System.out.print("Not palindrome");
        }

    }
}