
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Debanjan",(byte)28,(byte)16,"IIT");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student{
    String name;
    byte age;
    byte rollNumber;
    String college;

    Student(String name,byte age,byte rollNumber,String college)
    {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
}