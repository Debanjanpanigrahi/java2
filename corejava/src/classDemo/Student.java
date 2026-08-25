

public class Student {
    String name;
    int age;
    int rollNumber;
    String collegeName;

    void printStudent()
    {
        System.out.println(this.name+" "+this.age+" "+this.rollNumber+" "+this.collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.collegeName="IIT";
        s1.age=28;
        s1.rollNumber=121;
        s1.name="Debanjan";
        s1.printStudent();
    }
}
