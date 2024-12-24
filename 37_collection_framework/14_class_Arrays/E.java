import java.util.Arrays;
import java.util.Comparator;
class E {
    //main method
    public static void main(String[] args) {
        Student[] x = {new Student("umesh" , 45) , new Student("aman" , 21) , new Student("vigyan" , 32)
                       , new Student("ekta" , 28) , new Student("mukta" , 19) };
    
        //Iterating array of Student obj. through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(x , new AgeDescendingSort());//<-list or comparator dono pass krna padta h,<-ye internally AgeDescendingSort ki compare()<-method ko call krega.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Iterating sorted array of Student obj. through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");//<-age descending order m sort hoke print hoga array of Student obj.
        }
    }
}
class AgeDescendingSort implements Comparator<Student> {
    public int compare(Student obj1 , Student obj2) {
        return obj2.age.compareTo(obj1.age);
    }
}
class Student {
    String name;
    Integer age;

    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    } 
    public String toString() {
        return name + " $ " + age;
    }
}
/*OUTPUT: age k descending order m sort hoke print hoga arrays Student obj.
umesh $ 45      aman $ 21       vigyan $ 32     ekta $ 28       mukta $ 19
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
umesh $ 45      vigyan $ 32     ekta $ 28       aman $ 21       mukta $ 19 <-age descending order.*/