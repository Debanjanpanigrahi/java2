import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lesson1 {
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Debanjan", 90, 10));
        list.add(new Student("Sagnik", 80, 50));
        list.add(new Student("Rohan", 95, 20));
        list.add(new Student("Swastk", 90, 40));
        Comparator<Student> c1 = new sortByName();
        Comparator<Student> c2 = new sortByMarks();
        Comparator<Student> c3 = new sortByRollNo();

        Collections.sort(list,c1);
        
        for(Student s : list){
            System.out.println(s.name+" "+s.marks);
        }


        Collections.sort(list,c2);
        System.out.println("-----------------");
        for(Student s : list){
            System.out.println(s.name+" "+s.marks);
        }

        Collections.sort(list,new Comparator<Student>() {
            public int compare(Student s1,Student s2)
            {
                return s1.marks - s2.marks;
            }
        });

        System.out.println("-----------------");
        for(Student s : list){
            System.out.println(s.name+" "+s.marks);
        }

        Collections.sort(list,(s1,s2)->s1.marks-s2.marks);
    }
}

/*Tightly couple */
// class Student implements Comparable<Student>{
//     String name;
//     int marks;
//     int rollNo;

//     public Student(String name,int marks,int rollNo)
//     {
//         this.name = name;
//         this.marks = marks;
//         this.rollNo = rollNo;
//     }
    
//     @Override
//     public int compareTo(Student s1) {
//         return this.marks - s1.marks;
//     }
// }

class Student{
    String name;
    int marks;
    int rollNo;

    public Student(String name,int marks,int rollNo)
    {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }
}

class sortByName implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}

class sortByRollNo implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        return s1.rollNo - s2.rollNo;
    }
}

class sortByMarks implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        return s1.marks - s2.marks;
    }
}