import java.io.Console; //jaise Scanner class se UserInput lete h waise hi Console Class se bhi UserInput lete h.
import java.util.Comparator;//Comparator Interface ka use kr k hum kisi do Objects ki multiple properties k basis pe Comparison kr sakte h.
import java.util.TreeSet; 
class K {
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

        set.add(new Student("karthik" , 18));
        set.add(new Student("simha" , 9));
        set.add(new Student("vijendra" , 12));
        set.add(new Student("prasad" , 5));
        set.add(new Student("ganesh" , 10));

        System.out.println(set);
    }
}
class NameAscendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}
class NameDescendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm2.compareTo(nm1);
    }
}
class AgeAscendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

        return ag1.compareTo(ag2);
    }
}
class AgeDescendingSort implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

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
        return name + " ^ " + age;
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\6_Set_TreeSet>javac K.java
Note: K.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\javaprac\37_collection_framework\6_Set_TreeSet>java K
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
1
[ganesh ^ 10, karthik ^ 18, prasad ^ 5, simha ^ 9, vijendra ^ 12]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java K
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
2
[vijendra ^ 12, simha ^ 9, prasad ^ 5, karthik ^ 18, ganesh ^ 10]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java K
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
3
[prasad ^ 5, simha ^ 9, ganesh ^ 10, vijendra ^ 12, karthik ^ 18]

D:\javaprac\37_collection_framework\6_Set_TreeSet>java K
press 1 for NameAscendingSort:
press 2 for NameDescendingSort:
press 3 for AgeAscendingSort:
press 4 for AgeDescendingSort:
4
[karthik ^ 18, vijendra ^ 12, ganesh ^ 10, simha ^ 9, prasad ^ 5] */