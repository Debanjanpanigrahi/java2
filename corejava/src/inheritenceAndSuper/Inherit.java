class Demo{
    public static void main(String[] args)
    {
        EngineeringStudent student1 = new EngineeringStudent();
        student1.print();
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    int x=4;
}

class EngineeringStudent extends Student{
    String college;
    int x;

    void print(){
        System.out.println(super.x);
    }
}