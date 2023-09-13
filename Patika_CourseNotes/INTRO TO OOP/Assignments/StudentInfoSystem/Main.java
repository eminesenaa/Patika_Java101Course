package Assignments.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "MATH101", "MATH");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");
        Course biology = new Course("Biology", "BIO101", "BIO");
        
        Teacher t1 = new Teacher("John Smith", "90550000000", "MATH");
        Teacher t2 = new Teacher("Mary Johnson", "90550000001", "CHEM");
        Teacher t3 = new Teacher("Robert Davis", "90550000002", "BIO");
        
        math.addTeacher(t1);
        chemistry.addTeacher(t2);
        biology.addTeacher(t3);
        
        Student s1 = new Student("Michael", 4, "140144015", math, chemistry, biology);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();
        
        Student s2 = new Student("Emily", 4, "2211133", math, chemistry, biology);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();
        
        Student s3 = new Student("Jennifer", 4, "221121312", math, chemistry, biology);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
        

    }
}
