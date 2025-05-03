package Array_DSA;

import java.util.Scanner;

public class Array_DSA_Q5 {
    public static void Temprature(double temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println("temp: " + temp[i]);
        }
    }
    public static void Reverse(double temp[]){
        int st=0;
        int end=temp.length-1;
        while(st<=end){
            double temp2=temp[st];
            temp[st]=temp[end];
            temp[end]=temp2;
            st++;
            end--;

        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array:");
        int size = sc.nextInt();
        double temp[] = new double[size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value:" + count);
            temp[i] = sc.nextDouble();
            count++;
        }
        System.out.println("Before reverse:");
        Temprature(temp);
        Reverse(temp);
        System.out.println("after reverse:");
        Temprature(temp);



    }
}


