import java.util.Arrays;
class G {
    //main method
    public static void main(String... args) {
        Student[] x = {
            new Student("umesh" , 45) ,
            new Student("aman" , 21) ,
            new Student("vigyan" , 32) ,
            new Student("ekta" , 28) ,
            new Student("mukta" , 19) 
        };

        Arrays.sort(x);//array pass kr do,sort kr deta h,<-sort internally Student class ki compareTo()<-call krega.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Iterating sorted array of Student through Enhanced-forLoop.
        for(Student next : x) {
            System.out.print(next + "\t");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student y = new Student("mukta" , 22);//<-key,formula used:((-insertion_point)-1)

        System.out.println(Arrays.binarySearch(x , y));//array or key dono pass kr do,Search index return kr dega int m.
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
        return name + "$" + age;
    }
    public int compareTo(Student obj) {
        return obj.age.compareTo(this.age);//Descending order m sort kr dega.
    }
}
/*OUTPUT: age k descending order m sort hua array of Student obj.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
umesh$45        vigyan$32       ekta$28 aman$21 mukta$19
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
-4 <-agar mukta-22 exists krta array m to Search index((-insertion_point)-1)= -4 pe krta,kyuki array age
     k descending order k basis pe sort kia h. */