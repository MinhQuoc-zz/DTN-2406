package assignment09.comparing.entity;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private LocalDate birthDay;
    private int gpa;


    public Student(int id, String name, LocalDate birthDay, int gpa) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gpa = gpa;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Student(int id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
