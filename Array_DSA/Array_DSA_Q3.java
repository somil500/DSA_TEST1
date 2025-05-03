package Array_DSA;

import java.util.Scanner;

public class Array_DSA_Q3 {
    public static void Temprature(double temp[]) {
        for (double val:temp) {
            System.out.println("temp: " + val);
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
        Temprature(temp);

    }
}
