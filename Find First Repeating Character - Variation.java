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
            String s=sc.next();
            Map<Character,Integer> hm=new HashMap<>();
            boolean flag=false;
            String st="";
            for(int i=0;i<s.length();i++){
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                    flag=true;
                    st+=s.charAt(i);
                    break;
                }
                else{
                    hm.put(s.charAt(i),1);
                }
            }
            if(flag){
                System.out.println(st);
            }else{
                System.out.println(".");
            }
            t--;
        }
    }
}
