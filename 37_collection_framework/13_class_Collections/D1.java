import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
class D1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();
        
        x.add(new Employee("kartik" , 20));
        x.add(new Employee("raghav" , 34));
        x.add(new Employee("kejriwal" , 56));
        x.add(new Employee("rahul" , 55));
        x.add(new Employee("khadge" , 74));

        System.out.println(x);

        Collections.sort(x , new AgeDescendingSort());
        Collections.sort(x , new AgeAscendingSort());
        Collections.sort(x , new NameDescendingSort());
        Collections.sort(x , new NameAscendingSort());

        System.out.println(x);
    }
}
class NameAscendingSort implements Comparator<Employee> {
    public int compare(Employee obj1 , Employee obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}
class NameDescendingSort implements Comparator<Employee> {
    public int compare(Employee obj1 , Employee obj2) {
        return obj2.name.compareTo(obj1.name);
    }
}
class AgeAscendingSort implements Comparator<Employee> {
    public int compare(Employee obj1 , Employee obj2) {
        return obj1.age.compareTo(obj2.age);
    }
}
class AgeDescendingSort implements Comparator<Employee> {
    public int compare(Employee obj1 , Employee obj2) {
        return obj2.age.compareTo(obj1.age);
    }
}
class Employee {
    String name;
    Integer age;

    Employee(String name , Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    } 
}
//OUTPUT:AgeDescendingSort:-[khadge - 74, kejriwal - 56, rahul - 55, raghav - 34, kartik - 20]
//OUTPUT:AgeAscendingSort:-[kartik - 20, raghav - 34, rahul - 55, kejriwal - 56, khadge - 74]
//OUTPUT:NameDescendingSort:-[rahul - 55, raghav - 34, khadge - 74, kejriwal - 56, kartik - 20]
//OUTPUT:NameAscendingSort:-[kartik - 20, kejriwal - 56, khadge - 74, raghav - 34, rahul - 55]