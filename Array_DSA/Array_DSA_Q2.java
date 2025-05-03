package Array_DSA;

import java.util.Scanner;

public class Array_DSA_Q2 {
    public static double Temprature(double temp[] ,int val){
      /*  for(int i=0;i< temp.length;i++){
            System.out.println("temp: "+temp[i]);
        }
        */
        return (double) temp[val-1];
    }
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  size of array:");
        int size=sc.nextInt();
        double temp[]=new double[size];
        int count=1;
        for(int i=0;i<size;i++){
            System.out.println("Enter the value:"+count);
            temp[i]=sc.nextDouble();
            count++;
        }
        System.out.println("Enter the  value count that you want to access :");
        int val=sc.nextInt();

     double ans= Temprature(temp,val);
        System.out.println(ans);

    }
}
