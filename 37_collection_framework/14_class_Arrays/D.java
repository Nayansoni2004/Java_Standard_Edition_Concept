import java.util.Arrays;
class D {
    //main method
    public static void main(String[] args) {
        Student[] x = {new Student("umesh" , 45) , new Student("aman" , 21) , new Student("vigyan" , 32) , 
                       new Student("ekta" , 28) , new Student("mukta" , 19) };
        
        //Iterating array of Student obj. through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");
        }
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(x);//sort()<-internally Student class ki compareTo method ko call krega.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Iterating sorted array of Student obj. through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");
        }
    }
}
class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " $ " + age;
    }
    public int compareTo(Student obj) {
        return this.age.compareTo(obj.age);//Ascending order m sort kr dega.
    }
}
/*OUPUT:Ascending order m aayega,kyuki humne bta dia h sort()<- ko ki age k basis pe ascending order m sort 
        krna h array ko ,humne student class m compareTo()<-method ko meaningfully implement kia h age k basis  
        pe to sort()<-internally compareTo()<-method ko call krega or array ko age k ascending order m sort kr dega.
umesh $ 45      aman $ 21       vigyan $ 32     ekta $ 28       mukta $ 19
~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
mukta $ 19      aman $ 21       ekta $ 28       vigyan $ 32     umesh $ 45 <-age Ascending order m sort hua.*/