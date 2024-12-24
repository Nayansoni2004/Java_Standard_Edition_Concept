import java.util.Arrays;
class C {
    //main method
    public static void main(String[] args) {
        Student[] x = {
            new Student("umesh" , 45) ,
            new Student("aman" , 21) ,
            new Student("vigyan" , 32) ,
            new Student("ekta" , 28) ,
            new Student("mukta" , 19)
        };
        //Iterating array of Student obj. through Enhanced for-Loop.
        for(Student next : x) {
            System.out.print(next + "\t");//\t<-tab dene k liye use krte h.
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(x);/*sort()<-method m array pass kro sort kr deta h ascending order m,lekin Exception aayega,
                        kyuki humne bataya hi nhi ki kis basis pe sort krna h,name ya age,Ascending ya Descending.*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Iterating array of Student obj. through Enhanced for-Loop.
        for(Student next : x) {
            System.out.print(next + "\t");//back-slash t single tab dene k liye use krte h.
        }
    }
}
class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
/*OUTPUT: Runtime-Exception,un-checked Exception,ClassCastException,aya kyuki array ko sort krne pr batana padega
          ki kis basis pe sort krna h,name k basis pe ya age k basis pe,Ascending order m ya Descending order m.  
D:\javaprac\37_collection_framework\14_class_Arrays>java C
umesh - 45      aman - 21       vigyan - 32     ekta - 28       mukta - 19
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
        at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
        at java.base/java.util.Arrays.sort(Arrays.java:1041)
        at C.main(C.java:19) */