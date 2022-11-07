package lab1.task2;

public class EqualityTest {
    public static void main(String[] args) {
     Student[] students2 = new Student[2];
    students2[0] = new Student();
    students2[0].setName("Gigel");
    students2[0].setGrade(5);

    students2[1] = new Student();
    students2[1].setName("Gigel");
    students2[1].setGrade(5);

        System.out.println(students2[0].getName().equals(students2[1].getName()));
    }
}
