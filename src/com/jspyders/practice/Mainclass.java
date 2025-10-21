package com.jspyders.practice;
import java.util.ArrayList;
class Student {
    private String name;
    private int marks;
    private int rollno;

    public Student(String name, int marks, int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

public class Mainclass{
    public static void main(String[] args) {
        System.out.println("Program starts...");

        ArrayList<Student> students = new ArrayList<>();

        // CREATE (add students)
        students.add(new Student("S1", 50, 1));
        students.add(new Student("S2", 60, 2));
        students.add(new Student("S3", 70, 3));

        // READ (print all students using for loop)
        System.out.println("\n--- All Students ---");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Index " + i + " -> Name: " + s.getName() +
                    ", Marks: " + s.getMarks() +
                    ", Rollno: " + s.getRollno());
        }

        // UPDATE (modify student at index 1)
        System.out.println("\n--- Update Student at index 1 ---");
        for (int i = 0; i < students.size(); i++) {
            if (i == 1) {
                Student s = students.get(i);
                s.setName("Updated-S2");
                s.setMarks(95);
                s.setRollno(22);
                System.out.println("Updated index " + i + " -> Name: " + s.getName() +
                        ", Marks: " + s.getMarks() +
                        ", Rollno: " + s.getRollno());
            }
        }

        // READ again after update
        System.out.println("\n--- After Update ---");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Index " + i + " -> Name: " + s.getName() +
                    ", Marks: " + s.getMarks() +
                    ", Rollno: " + s.getRollno());
        }

        // DELETE (remove student at index 0)
        System.out.println("\n--- Delete Student at index 0 ---");
        for (int i = 0; i < students.size(); i++) {
            if (i == 0) {
                students.remove(i);
                break; // remove once then exit loop
            }
        }

        // READ after delete
        System.out.println("\n--- After Delete ---");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Index " + i + " -> Name: " + s.getName() +
                    ", Marks: " + s.getMarks() +
                    ", Rollno: " + s.getRollno());
        }

        System.out.println("\nProgram ends...");
    }
}

