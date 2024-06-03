import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args)
    {

//        Student student = new Student("BH00123","Vu Duy Hoa", 80);
//        System.out.println("Student Infor: Name " + student.getName());
//        System.out.println("Student Infor: Code " + student.getId());
//        System.out.println("Student Infor: Grade " + student.getGrade());


        int n ;

        System.out.println("Enter number of students in your class:");

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        input(n);

        System.out.println("View student list info:");

        output();

    }


    public static void input(int n)
    {
        // n = so luong sinh vien muon khoi tao

        for(int i = 1;i<=n ; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter code:");
            String code = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter grade:");
            float grade = scanner.nextFloat();
            Student student = new Student(code, name, grade);
            studentList.add(student);

        }

    }

    public static void output(){


        for(Student student: studentList){

            System.out.println(
                    "Student Info: - Code:" + student.getId()
                    + "- Name:" + student.getName()
                    + "- Grade:"+ student.getGrade());
        }
    }


}