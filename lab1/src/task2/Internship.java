package lab1.task2;

import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void chooseCandidateRandomly() {
        var rand = new Random();
        var randStudent = rand.nextInt(students.length);
        System.out.println(students[randStudent]);
    }

    public void chooseCandidatesForInterview() {
       for(int i = 0 ; i < students.length; i++){
           if(students[i].getGrade() >= minGrade)
               System.out.println("Candidate " + students[i].getName() +" got a phone interview at " + name);
       }
    }

}
