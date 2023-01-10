import java.util.*;

public class Main {
    static void findPrimesUntilN(int n) {
        boolean[] prime = new boolean[n+1];
		Arrays.fill(prime,true);
		for(int p=2; p*p<=n; p++){
			if(prime[p]){
				// mark multipliers of 2 as false
				for(int j=p*p; j<=n; j+=p){
					prime[j] = false;
				}
			}
		}
		for(int i=2; i<=n; i++){
			if(prime[i]){
				System.out.println(i);
			}
		}
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimesUntilN(n);
    }
}


//Time Complexity: O(n*log(log(n)))
//Auxiliary Space: O(n)
