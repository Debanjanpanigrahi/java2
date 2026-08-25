import java.util.function.Predicate;

public class lesson4 {
    public static void main(String[] args)
    {
        Predicate<Student> passed = student -> student.marks > 80;
        Predicate<Student> isAdult = student -> student.age > 18;
        Predicate<Student> isEligible = passed.and(isAdult);
        System.out.print(isEligible);
    }
    
}

class Student{
    int marks;
    int age;

    public Student(int marks,int age)
    {
        this.marks = marks;
        this.age=age;
    }
}