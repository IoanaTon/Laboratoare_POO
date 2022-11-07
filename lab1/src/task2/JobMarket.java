package lab1.task2;



public class JobMarket {
    public static void main (String args[]) {
        Student[] students = new Student[4];
        students[0] = new Student();
        students[0].setName("Gigel");
        students[0].setGrade(5);

        students[1] = new Student();
        students[1].setName("Dorel");
        students[1].setGrade(9);

        students[2] = new Student();
        students[2].setName("Marcel");
        students[2].setGrade(7);

        students[3] = new Student();
        students[3].setName("Ionel");
        students[3].setGrade(10);

        Internship[] internships = new Internship[4];
        internships[0] = new Internship();
        internships[0].setName("Google");
        internships[0].setMinGrade(5);
        internships[0].setStudents(students);

        internships[1] = new Internship();
        internships[1].setName("Amazon");
        internships[1].setMinGrade(8);
        internships[1].setStudents(students);

        internships[2] = new Internship();
        internships[2].setName("Facebook");
        internships[2].setMinGrade(7);
        internships[2].setStudents(students);

        internships[3] = new Internship();
        internships[3].setName("Microsoft");
        internships[3].setMinGrade(9);
        internships[3].setStudents(students);


        for(int i = 0; i < internships.length; i++){
            internships[i].chooseCandidatesForInterview();
        }

    }
}
