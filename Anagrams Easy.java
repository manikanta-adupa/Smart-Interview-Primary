import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String a=sc.next(),b=sc.next();
            Map<Character,Integer> hm=new HashMap<>();
            Map<Character,Integer> hm1=new HashMap<>();
            for(int i=0;i<a.length();i++){
                if(hm.containsKey(a.charAt(i))){
                    hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
                }
                else{
                    hm.put(a.charAt(i),1);
                }
            }
            for(int i=0;i<b.length();i++){
                if(hm1.containsKey(b.charAt(i))){
                    hm1.put(b.charAt(i),hm1.get(b.charAt(i))+1);
                }
                else{
                    hm1.put(b.charAt(i),1);
                }
            }
            if(hm.equals(hm1)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            t--;
        }
    }
}
