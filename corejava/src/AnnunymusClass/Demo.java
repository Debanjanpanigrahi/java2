public class Demo {

    public static void main(String[] args) {

        Person p1 = new Person() {
            @Override
            void introduce() {
                System.out.println("Anonymous class");
            }
        };

        p1.introduce();
    }
}

class Person {
    void introduce() {
        System.out.println("Hello");
    }
}