package Assignments.StudentInfoSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = -1;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("Teacher added");
        } else
            System.out.println("This teacher cannot teach this lesson.");
    }

    public void printTeacher() {
        if(this.teacher != null)
        System.out.printf("The teacher of %s course is %s", this.name , this.teacher.name);
        else
        System.out.println("Teacher hasn't been added.");
    }

}
