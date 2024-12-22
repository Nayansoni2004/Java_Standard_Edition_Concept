import java.io.Console;
import java.util.Comparator;
import java.util.PriorityQueue;
class C {
    //main method
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println("press 1 for NameAscendingSort: \nPress 2 for NameDescendingSort: \nPress 3 for AgeAscendingSort: \nPress 4 for AgeDescendingSort: ");
        int input = Integer.parseInt(con.readLine());//<-return type string isley parseInt se integer m convert krna padega.

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

        PriorityQueue pq = new PriorityQueue(comp);

        pq.offer(new Student("kartik" , 18));
        pq.offer(new Student("simha" , 9));
        pq.offer(new Student("vijendra" , 12));
        pq.offer(new Student("prasad" , 5));
        pq.offer(new Student("ganesh" , 10));

       // System.out.println(pq);
        int size = pq.size();
        for(int i = 0 ;  i < size ; i++) {
            System.out.println(pq.poll());//<-returnType Element<E>.
        } 
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
        return name + " ^ " + age;
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\7_Queue_PriorityQueue>javac C.java
Note: C.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\javaprac\37_collection_framework\7_Queue_PriorityQueue>java C
press 1 for NameAscendingSort:
Press 2 for NameDescendingSort:
Press 3 for AgeAscendingSort:
Press 4 for AgeDescendingSort:
1
ganesh ^ 10
kartik ^ 18
prasad ^ 5
simha ^ 9
vijendra ^ 12

D:\javaprac\37_collection_framework\7_Queue_PriorityQueue>java C
press 1 for NameAscendingSort:
Press 2 for NameDescendingSort:
Press 3 for AgeAscendingSort:
Press 4 for AgeDescendingSort:
2
vijendra ^ 12
simha ^ 9
prasad ^ 5
kartik ^ 18
ganesh ^ 10

D:\javaprac\37_collection_framework\7_Queue_PriorityQueue>java C
press 1 for NameAscendingSort:
Press 2 for NameDescendingSort:
Press 3 for AgeAscendingSort:
Press 4 for AgeDescendingSort:
3
prasad ^ 5
simha ^ 9
ganesh ^ 10
vijendra ^ 12
kartik ^ 18

D:\javaprac\37_collection_framework\7_Queue_PriorityQueue>java C
press 1 for NameAscendingSort:
Press 2 for NameDescendingSort:
Press 3 for AgeAscendingSort:
Press 4 for AgeDescendingSort:
4
kartik ^ 18
vijendra ^ 12
ganesh ^ 10
simha ^ 9
prasad ^ 5 */