public class Demo3 {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Debanjan");
        sb.insert(2, "sa");
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.replace(0, 2, "sag");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.print(sb.capacity());
    }
}

class animal{

}

class Dog extends animal{
    void bark()
    {

    }
} 

class A{
    public static void main(String[] args)
    {
        animal a = new Dog();
        a.bark();
    }
}