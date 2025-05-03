package String_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private String course_id;
    private String course_name;
    private String getCourse_title;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getGetCourse_title() {
        return getCourse_title;
    }

    public void setGetCourse_title(String getCourse_title) {
        this.getCourse_title = getCourse_title;
    }


}
public class String_DSA_Q1
{
    public  static void  get_details(List<Course> course,String id){

        for(Course course1:course){
            String courseid=course1.getCourse_id();

                System.out.println("Course ID:--->"+course1.getCourse_id());
                System.out.println("Course Name:--->"+course1.getCourse_name());
                System.out.println("Course Title:--->"+course1.getGetCourse_title());



        }

    }

    public static void main(String[]args){
        ArrayList<Course>courses=new ArrayList<>();
        int temp=0;
        Scanner sc = new Scanner(System.in);
        while(temp==0) {
            Course c = new Course();
            // ArrayList<Course>courses=new ArrayList<>();
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter The course id:");
            String id = sc.next();
            c.setCourse_id(id);
            System.out.println("Enter The course name:");
            String name = sc.next();
            c.setCourse_name(name);
            System.out.println("Enter The course title:");
            String title = sc.next();
            c.setGetCourse_title(title);

            courses.add(c);
            System.out.println("course has successfully added");

            System.out.println("Enter 1 for Exist:");
           System.out.println("Enter 0 for create course again: ");
            //System.out.println("Enter 2 get course ");

            int temp2= sc.nextInt();

            if(temp2==1) {
                System.out.println("System is existing....");

                temp = 1;
            }




        }
        System.out.println("Enter 2 To Get all courses");
        String id2=sc.next();

        get_details(courses,id2);

    }

}
