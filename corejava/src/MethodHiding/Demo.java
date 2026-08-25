class Parent {
     static void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
     static void display() {
        System.out.println("Child");
    }
}

public class Demo{
    public static void main(String[] args)
    {
        Parent c1 = new Child();/*method Hiding */
        c1.display();//child
    }
}