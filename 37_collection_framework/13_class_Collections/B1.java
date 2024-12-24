import java.util.Collections;
import java.util.ArrayList;
class B1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("kartik" , 20));
        x.add(new Employee("raghav" , 34));
        x.add(new Employee("kejriwal" , 56));
        x.add(new Employee("rahul" , 55));
        x.add(new Employee("khadge" , 74));

        System.out.println(x);

        Collections.sort(x);/*kyuki hume ne Employee class m compareTo()<-implement kia h name k basis pe to ye
                              sort(x)<-method name k Ascending basis pe ArrayList ko sort kr degi.*/
        System.out.println(x);
    }
}
class Employee implements Comparable {
    String name;
    int age;

    Employee(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
    public int compareTo(Object obj) {
        String nm1 = this.name;
        String nm2 = ((Employee)obj).name;

        return nm1.compareTo(nm2);
    }
}
/*OUTPUT:kyuki hum ne sort method ko bta dia h ki kis basis pe ArrayList ko sort krna h,kyuki humne Employee
         class m compareTo(Object obj)<-method ko name k basis pe implement kia h,to sort()<-method name k
         basis pe Ascending order m ArrayList ko sort kr degi.
[kartik - 20, raghav - 34, kejriwal - 56, rahul - 55, khadge - 74]
[kartik - 20, kejriwal - 56, khadge - 74, raghav - 34, rahul - 55] */