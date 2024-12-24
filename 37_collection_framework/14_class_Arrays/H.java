import java.util.Arrays;
import java.util.Comparator;
class H {
    //main method
    public static void main(String[] args) {
        Student[] x = {
            new Student("umesh" , 45) ,
            new Student("aman" , 21) ,
            new Student("vigyan" , 32) ,
            new Student("ekta" , 28) ,
            new Student("mukta" , 19)
        };
        Comparator<Student> comp = new AgeDescendingSort();

        Arrays.sort(x , comp);//<-array,Comparator pass kr do sort kr deta,comparator k basis pe johan sa wala Comparator pass krte h.
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Iterating sorted array of Student obj. through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");//sort hone k baad array k elements print ho jayenge.
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student y = new Student("mukta" , 22);

        System.out.println(Arrays.binarySearch(x , y , comp));//array,key,Comparator teeno pass kr do.
    }
}
class NameAscendingSort implements Comparator<Student> {
    public int compare(Student obj1 , Student obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}
class NameDescendingSort implements Comparator<Student> {
    public int compare(Student obj1 , Student obj2) {
        return obj2.name.compareTo(obj1.name);
    }
}
class AgeAscendingSort implements Comparator<Student> {
    public int compare(Student obj1 , Student obj2) {
        return obj1.age.compareTo(obj2.age);
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
/*OUTPUT: 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
umesh $ 45      vigyan $ 32     ekta $ 28       aman $ 21       mukta $ 19
~~~~~~~~~~~~~~~~~~~~~~~~~~~~
-4 <-agar mukta-22 exists krta list m to age k descending order k basis pe formula used:((-insertion_point)-1)
     =-4 <-Search Index pe krta. */