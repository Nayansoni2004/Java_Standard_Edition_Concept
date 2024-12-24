import java.util.Collections;
import java.util.ArrayList;
class C1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("kartik" , 20));
        x.add(new Employee("raghav" , 34));
        x.add(new Employee("kejriwal" , 56));
        x.add(new Employee("rahul" , 55));
        x.add(new Employee("khadge" , 74));

        System.out.println(x);

        Collections.sort(x);//sort(x)<-method list ko age k Ascending basis pe sort kr dega.

        System.out.println(x);
    }
}
class Employee implements Comparable<Employee> {
    String name;
    Integer age;

    Employee(String name , Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
    public int compareTo(Employee obj) {
        return this.age.compareTo(obj.age);
    }
}
/*OUTPUT:sort(x)<-method list ko age k Ascending basis pe sort ka dega,kyuki sort()<-internally Employee type-
         safe class ki compareTo(Employee obj)<-method ko call krega,jo humne age k ascending basis pe meaning-
         fully implement ki h.
[kartik - 20, raghav - 34, kejriwal - 56, rahul - 55, khadge - 74]
[kartik - 20, raghav - 34, rahul - 55, kejriwal - 56, khadge - 74]<-age k ascending order m.
 */