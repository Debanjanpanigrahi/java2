class staticDemo{
    public static void main(String[] args)
    {
        Student s1 = new Student("Debanjan",28,13);
       // Student.college = "Iem";
        System.out.println(s1.name+" "+s1.age+" "+s1.rollNumber+" "+Student.college);
    }
}

class Student{
    String name;
    int age;
    int rollNumber;;
    static String college;

    Student(String name,int age,int rollNumber)
    {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    static{
        college = "IIT G";
    }
}