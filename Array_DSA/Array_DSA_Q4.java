package Array_DSA;

import java.util.Scanner;

public class Array_DSA_Q4
{
    public static void Student(String []student_name) {
        for (String val:student_name) {
            System.out.println("name: " + val);
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  no of student:");
        int size = sc.nextInt();
        String student_name[] = new String[size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value:" + count);
            student_name[i] = sc.next();
            count++;
        }
        Student(student_name);

    }
}
