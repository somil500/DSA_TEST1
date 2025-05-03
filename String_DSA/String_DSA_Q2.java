package String_DSA;

import java.util.Scanner;

public class String_DSA_Q2
{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name in lowercase letter :"+1);
        String str=sc.next();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ch2=ch-32;
            ans+=(char)ch2;

        }
        System.out.println(ans);
        


    }
}
