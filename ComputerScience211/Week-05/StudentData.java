// CS 211 HW 5
//   StudentData represent a student record
//
//   Please don't modify!

public class StudentData {
    private String name;
    private String id;
    private double grade;

    public StudentData(String name, String id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public String toString() {
        return name + "\t\t" + id + "\t\t" + grade;
    }
}
