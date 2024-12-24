import java.util.Collections;
import java.util.ArrayList;
class C {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("kartik" , 20));
        x.add(new Employee("raghav" , 34));
        x.add(new Employee("kejriwal" , 56));
        x.add(new Employee("rahul" , 55));
        x.add(new Employee("khadge" , 74));

        System.out.println(x);

        Collections.sort(x);//<-sort(x)method internally Employee class ki compareTo(Object obj) ko call krega.

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

        return nm2.compareTo(nm1);
    }
}
/*OUTPUT: ArrayList sort hone k baad,list name k descending order m arrange hogi,kyuki humne Employee class m
          compareTo(Object obj)<-method ko name k descending basis m meaningfully implement kia h,to sort(x)<-
          method internally Employee class ki compareTo(Object obj)<-ko call krega.
[kartik - 20, raghav - 34, kejriwal - 56, rahul - 55, khadge - 74]
[rahul - 55, raghav - 34, khadge - 74, kejriwal - 56, kartik - 20]<-name k descending order m,sort hua.*/