import java.util.Scanner;
import java.util.TreeMap;
import java.util.Comparator;
class C {
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
            default:
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
class NameAscendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student s1 = (Student)obj1;
        Student s2 = (Student)obj2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
}
class NameDescendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student s1 = (Student)obj1;
        Student s2 = (Student)obj2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm2.compareTo(nm1);
    }
}
class AgeAscendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student s1 = (Student)obj1;
        Student s2 = (Student)obj2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag1.compareTo(ag2);
    }
}
class AgeDescendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student s1 = (Student)obj1;
        Student s2 = (Student)obj2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag2.compareTo(ag1);
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
/*OUTPUT: Comparator Interface ka use kia h kyuki do property k basis pe comparison krna h,name or age dono k
          basis pe ascending or descending dono order m,switch case ka use kia h obj. pass krne k liye,Scanner
          class ka use kia h input lene k liye.TreeMap sorted collection class ka use ki h records ko manage krne
          k liye.
D:\javaprac\37_collection_framework\11_Map_TreeMap>javac C.java
Note: C.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
1
{hemant - 19=SRIT, kamal - 23=GGITS, om - 21=JEC, prateek - 18=GGCT, ram - 24=HEC, ratnesh - 22=Global}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
2
{ratnesh - 22=Global, ram - 24=HEC, prateek - 18=GGCT, om - 21=JEC, kamal - 23=GGITS, hemant - 19=SRIT}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
3
{prateek - 18=GGCT, hemant - 19=SRIT, om - 21=JEC, ratnesh - 22=Global, kamal - 23=GGITS, ram - 24=HEC}

D:\javaprac\37_collection_framework\11_Map_TreeMap>java C
Enter:
1 for NameAscendingSort:
2 for NameDescendingSort:
3 for AgeAscendingSort:
4 for AgeDescendingSort:
4
{ram - 24=HEC, kamal - 23=GGITS, ratnesh - 22=Global, om - 21=JEC, hemant - 19=SRIT, prateek - 18=GGCT} */