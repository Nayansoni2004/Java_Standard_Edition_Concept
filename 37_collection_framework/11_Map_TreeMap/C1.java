import java.util.Scanner;
import java.util.Comparator;
import java.util.TreeMap;
class C1 {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: \n1 for NameAscendingSort: \n2 for NameDescendingSort: \n3 for AgeAscendingSort: \n4 for AgeDescendingSort: ");

        int input = sc.nextInt();

        Comparator<Student> comp = null;

        switch(input) {
            case 1: 
                comp = new NameAscendingSort();
                break;
            case 2:
                comp = new NameDescendingSort();
                break;
            case 3: 
                comp = new AgeAscendingSort();
                break;
            case 4:
                comp = new AgeDescendingSort();
                break;
            default :
                System.out.println("Invalid Input!");
                System.exit(0);
        }
        TreeMap<Student,College> map = new TreeMap<Student,College>(comp);

        map.put(new Student("om" , 21) , new College("JEC"));
        map.put(new Student("hemant" , 19) , new College("SRIT"));
        map.put(new Student("ratnesh" , 22) , new College("Global"));
        map.put(new Student("ram" , 24) , new College("HEC"));
        map.put(new Student("prateek" , 18) , new College("GGCT"));
        map.put(new Student("kamal" , 23) , new College("GGITS"));

        System.out.println(map);
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
        return name + " - " + age;
    }
}
class College {
    String name;

    College(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
/*OUTPUT:Scanner<-class ka use kia h user input lene k liye,switch case ka use kia obj. pas krne k liye,
         Comparator Interface ka use kia name or age dono properties k ascending or descending dono basis pe 
         comparasion krne k liye or TreeMap ka use kia records ko manage krne k liye. or compilation pr 
         warning nhi aai,kyuki type-safe banaya h Comparator ko.
D:\javaprac\37_collection_framework\11_Map_TreeMap>javac C1.java

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C1
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
1
{hemant - 19=SRIT, kamal - 23=GGITS, om - 21=JEC, prateek - 18=GGCT, ram - 24=HEC, ratnesh - 22=Global}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C1
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
2
{ratnesh - 22=Global, ram - 24=HEC, prateek - 18=GGCT, om - 21=JEC, kamal - 23=GGITS, hemant - 19=SRIT}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C1
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
3
{prateek - 18=GGCT, hemant - 19=SRIT, om - 21=JEC, ratnesh - 22=Global, kamal - 23=GGITS, ram - 24=HEC}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C1
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
4
{ram - 24=HEC, kamal - 23=GGITS, ratnesh - 22=Global, om - 21=JEC, hemant - 19=SRIT, prateek - 18=GGCT} */