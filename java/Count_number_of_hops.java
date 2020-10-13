import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static int countHops(int n){
         int a[] = new int [n+3];
         a[0] = 1;
         a[1] = 1;
         a[2] = 2;
        
         for(int i=3 ; i<=n ; i++)
            a[i] = a[i-1] + a[i-2] + a[i-3];
         
         return a[n];
     }
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- >0){
	        int n = s.nextInt();
	        int ans = countHops(n);
	        System.out.println(ans);
	    }
    }
}
