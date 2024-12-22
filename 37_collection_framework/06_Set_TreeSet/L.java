//Refined implementation of K.java kyuki isme humne Comparator Interface ko type-safe declare kr dia h.
import java.io.Console;//jaise Scanner class se UserInput lete h waise hi Console Class se bhi UserInput lete h.
import java.util.Comparator;//Comparator Interface ka use kr k hum kisi do Objects ki multiple properties k basis pe Comparison kr sakte h.
import java.util.TreeSet;
class L {
    //main method
    public static void main(String[] args) {
        Console con = System.console();//<-System class ki static method h->console()isley <classname.memebername>

        System.out.println("press 1 for NameAscendingSort: \npress 2 for NameDescendingSort: \npress 3 for AgeAscendingSort: \npress 4 for AgeDescendingSort: ");
        int input = Integer.parseInt(con.readLine());//<-reads a single line of text from console,return_type String.

        Comparator comp = null;

        if(input == 1) {
            comp = new NameAscendingSort();
        } else if(input == 2) {
            comp = new NameDescendingSort();
        } else if(input == 3) {
            comp = new AgeAscendingSort();
        } else if(input == 4) {
            comp = new AgeDescendingSort();
        }

        TreeSet set = new TreeSet(comp);//yaha pr jonsa wala obj. user ne input kia hoga wo assign ho jayega,or usi obj. k basis pe records arrage kr k cmd return krega console window pe.

        set.add(new Student("kartik" , 18));
        set.add(new Student("simha" , 9));
        set.add(new Student("vijendra" , 12));
        set.add(new Student("prasad" , 5));
        set.add(new Student("ganesh" , 10));

        System.out.println(set);
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
        return name + " ^  " + age;
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\6_Set_TreeSet>javac L.java
Note: L.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\javaprac\37_collection_framework\6_Set_TreeSet>java L
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
1
[ganesh ^  10, kartik ^  18, prasad ^  5, simha ^  9, vijendra ^  12]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java L
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
2
[vijendra ^  12, simha ^  9, prasad ^  5, kartik ^  18, ganesh ^  10]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java L
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
3
[prasad ^  5, simha ^  9, ganesh ^  10, vijendra ^  12, kartik ^  18]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java L
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
4
[kartik ^  18, vijendra ^  12, ganesh ^  10, simha ^  9, prasad ^  5] */