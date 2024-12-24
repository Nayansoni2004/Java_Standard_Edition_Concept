import java.util.ArrayList;
import java.util.Collections;
class B {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();
        
        x.add(new Employee("kartik" , 20));
        x.add(new Employee("raghav" , 34));
        x.add(new Employee("kejriwal" , 56));
        x.add(new Employee("rahul" , 55));
        x.add(new Employee("khadge" , 74));

        System.out.println(x);

        Collections.sort(x);//hume ye ni bataya ki kis basis pe sort krna h name k basis pe ya age k basis pe.

        System.out.println(x);
    }
}
class Employee {
    String name;
    int age;

    Employee(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
/* OUTPUT:sort()<-method m list pr kro Ascending order m sort kr deta h,but humne bataya nhi h kis basis pe sort
          krna h name k basis pe ya age k basis pe isley error aaya.
          
D:\javaprac\37_collection_framework\13_class_Collections>javac B.java
B.java:16: error: no suitable method found for sort(ArrayList<Employee>)
        Collections.sort(x);//hume ye ni bataya ki kis basis pe sort krna h name k basis pe ya age k basis pe.
                   ^
    method Collections.<T#1>sort(List<T#1>) is not applicable
      (inference variable T#1 has incompatible bounds
        equality constraints: Employee
        lower bounds: Comparable<? super T#1>)
    method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
      (cannot infer type-variable(s) T#2
        (actual and formal argument lists differ in length))
  where T#1,T#2 are type-variables:
    T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
    T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
1 error */