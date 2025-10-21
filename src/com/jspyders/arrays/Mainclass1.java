package com.jspyders.arrays;

class Student{
    private String name;
    private int marks;
    private int Rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }
}

public class Mainclass1{
    public static void main(String[] args) {
        System.out.println("Program starts...");

//        Student[] students = new Student[4];
//
//        Student s1 = new Student();
//        s1.setName("S1");
//        s1.setMarks(50);
//        s1.setRollNo(1);
//
//        students[0] = s1;
//
//        students[1] = new Student();
//        students[1].setName("S2");
//        students[1].setMarks(50);
//        students[1].setRollNo(2);
//
//        System.out.println(students);
//
//        System.out.println("Name  : "+students[0].getName());
//        System.out.println("Marks : "+students[0].getMarks());
//        System.out.println("Roll No :"+students[0].getRollNo());

        StudentService sv = new StudentService();
        Student s1 = new Student();
        s1.setName("S1");
        s1.setMarks(50);
        s1.setRollno(1);

        sv.addStudent(s1);
        sv.getStudent(100);
        sv.getStudent( 0);

        sv.updateStudent(0, "S2", 99, 2);
        sv.getStudent(0);  // Show updated S1

        sv.deleteStudent(1); // Delete S2
        sv.getStudent(1);

        System.out.println("Program ends...");
    }
}


class StudentService
{
    private Student[] students = new Student[5];
    private int currentIndex = 0;

    public void addStudent(Student student){
        if(currentIndex<=students.length-1){
            students[currentIndex] = student;
            currentIndex++;
            System.out.println("Student added");
        }
        else
        {
            System.out.println("Array is full cannot add any other student");
        }
    }

    //prints the student data in given index
    public void getStudent(int index){
        if(index >= 0 && index<=students.length-1 && students[index]!=null){
            System.out.println("Name  : "+students[index].getName());
            System.out.println("Marks : "+students[index].getMarks());
            System.out.println("Roll No :"+students[index].getRollno());
        }
        else {
            System.out.println("Invalid index");
        }
    }

    //update array
    public void updateStudent(int index, String newName, int newMarks, int newRollno) {
        if (index >= 0 && index <= students.length - 1 && students[index] != null) {
            students[index].setName(newName);
            students[index].setMarks(newMarks);
            students[index].setRollno(newRollno);
            System.out.println("Student at index " + index + " updated successfully.");
        } else {
            System.out.println("Invalid index, cannot update.");
        }
    }

    //delete array
    public void deleteStudent(int index) {
        if (index >= 0 && index < currentIndex) {
            // Shift all students left from the index
            for (int i = index; i < currentIndex - 1; i++) {
                students[i] = students[i + 1];
            }
            students[currentIndex - 1] = null; // last becomes null
            currentIndex--; // reduce count
            System.out.println("Student deleted at index " + index);
        }
        else
        {
            System.out.println("Invalid index, cannot delete");
        }
    }
}



