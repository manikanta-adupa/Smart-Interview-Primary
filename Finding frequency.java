import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i],1);
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            if(hm.containsKey(x)){
                System.out.println(hm.get(x));
            }
            else{
                System.out.println(0);
            }
        }
        
        
    }
}
