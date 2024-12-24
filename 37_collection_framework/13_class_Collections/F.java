import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
class F {
    //main method
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("manoj" , 52));
        x.add(new Employee("geet" , 23));
        x.add(new Employee("balram" , 19));
        x.add(new Employee("om" , 47));
        x.add(new Employee("deepak" , 62));
        x.add(new Employee("yamraj" , 32));

        System.out.println("Before sort list is: " + x);

        //NameAscendingSort comp = new NameAscendingSort();
        //NameDescendingSort comp = new NameDescendingSort();
        //AgeAscendingSort comp = new AgeAscendingSort();
        AgeDescendingSort comp = new AgeDescendingSort();

        Collections.sort(x , comp);//is line pr list sort ho chuki h.
        System.out.println("After sort list is: " + x);

        Employee emp = new Employee("manoj" , 19);//<-key.
        System.out.println(Collections.binarySearch(x, emp , comp));//<-list,key,comparator teeno pass krna padta h is method m.
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
/*OUTPUT:list ko Name k ascending order m sort krne k baad manoj - 19 ,Search index 3 pe aaya.
D:\javaprac\37_collection_framework\13_class_Collections>java F
Before sort list is: [manoj - 52, geet - 23, balram - 19, om - 47, deepak - 62, yamraj - 32]
After sort list is: [balram - 19, deepak - 62, geet - 23, manoj - 52, om - 47, yamraj - 32]
3 */

/*OUTPUT:list ko Name k descending order m sort krne k baad manoj - 19 ,Search index 2 pe aaya.
D:\javaprac\37_collection_framework\13_class_Collections>java F
Before sort list is: [manoj - 52, geet - 23, balram - 19, om - 47, deepak - 62, yamraj - 32]
After sort list is: [yamraj - 32, om - 47, manoj - 52, geet - 23, deepak - 62, balram - 19]
2 */

/*OUTPUT:list ko Age k ascending order m sort krne k baad manoj - 19 ,Search index 0 pe aaya.
D:\javaprac\37_collection_framework\13_class_Collections>java F
Before sort list is: [manoj - 52, geet - 23, balram - 19, om - 47, deepak - 62, yamraj - 32]
After sort list is: [balram - 19, geet - 23, yamraj - 32, om - 47, manoj - 52, deepak - 62]
0 */

/*OUTPUT:list ko Age k descending order m sort krne k baad manoj - 19 ,Search index 5 pe aaya.
D:\javaprac\37_collection_framework\13_class_Collections>java F
Before sort list is: [manoj - 52, geet - 23, balram - 19, om - 47, deepak - 62, yamraj - 32]
After sort list is: [deepak - 62, manoj - 52, om - 47, yamraj - 32, geet - 23, balram - 19]
5 */