package Assignments.StudentInfoSystem;

public class Student {
    String name;
    String stuNo;
    int grade;
    Course math;
    Course chemistry;
    Course biology;
    double average;
    boolean isPass;

    public Student(String name, int grade,  String stuNo,Course math, Course chemistry, Course biology) {
        this.name = name;
        this.stuNo = stuNo;
        this.grade = grade;
        this.math = math;
        this.chemistry = chemistry;
        this.biology = biology;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mathNote, int chemistryNote, int biologyNote) {
        if (mathNote >= 0 && mathNote <= 100)
            this.math.note = mathNote;
        if (chemistryNote >= 0 && chemistryNote <= 100)
            this.chemistry.note = chemistryNote;
        if (biologyNote >= 0 && biologyNote <= 100)
            this.biology.note = biologyNote;
    }

   public double calcAverage() {
        return (this.math.note + this.chemistry.note + this.biology.note) / 3;
    }

   public void isPass() {
        if (math.note < 0 || chemistry.note < 0 || biology.note < 0)
            System.out.println("Notes were entered incompletely");
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average:  " + calcAvarage());
            if (this.isPass)
                System.out.println("passed the class.");
            else
                System.out.println("failed the class.");
        }

    }

    public double calcAvarage() {
     return this.average = (this.math.note + this.chemistry.note + this.biology.note) / 3;
    }

    public boolean isCheckPass() {
        return calcAvarage() > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note);
        System.out.println("Chemistry Note : " + this.chemistry.note);
        System.out.println("Biology Note : " + this.biology.note);
    }
}
