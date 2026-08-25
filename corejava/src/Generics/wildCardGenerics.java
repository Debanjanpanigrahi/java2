import java.util.ArrayList;
import java.util.List;

public class wildCardGenerics {
    public static void main(String[] args)
    {
        Animal a = new Dog();
        //a.bark();

        List<Dog> Dogs = new ArrayList<>();
        //List<Animal> animals = dogs;/*Not possible*/
        Dogs.add(new Dog());
        Dogs.add(new Dog());
        funAdv(Dogs);
        funAdvWithBounds(Dogs);

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        //animals[0] = new Animal();/*as dogs is a child class of animal it can not store refernce of Animal */

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[4] = new Dog();

        for ( Animal animal : animals){
            if(animal == null){
                return;
            }

            else{
                animal.eat();
              //  animal.bark();
            }  
        }
        
        
    }

   static void fun(List<Animal> animals){
        for(Animal animal : animals)
        {
            animal.eat();
        }
    }

    static void funAdv(List<?> values){
        for(Object obj : values)
        {
            System.out.println(obj.getClass().getName());
        }
    }

    static void funAdvWithBounds(List<? extends Animal> values){
        for(Animal obj : values)
        {
            System.out.println(obj.getClass().getName());
            obj.eat();
            obj.walk();
        }
    }
}

class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }

    void walk()
    {
        System.out.println("walking");
    }
}


class Dog extends Animal{
    void bark()
    {
        System.out.println("Barking");
    }
}