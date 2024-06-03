package models;

public class Student {

    // When declare variables in Java using keyword private for all properties
    // Khi khai bao bien trong ngon ngu lap trinh Java thi chung ta su dung tu khoa private cho cac bien

    private String id;

    private String name;

    private float grade;
    // Constructor khong co tham so
    // Hay con duoc goi la Constructor Rong (Empty Constructor)
    public Student(){

    }


    public Student(String id, String name, float grade){

        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
