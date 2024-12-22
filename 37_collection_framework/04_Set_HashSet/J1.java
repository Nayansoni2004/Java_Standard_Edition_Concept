import java.util.HashSet;

class J1 {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student("hritik" , 12));
        set.add(new Student("ratnesh" , 18));
        set.add(new Student("raj" , 9)); //same
        set.add(new Student("vikki" , 12));
        set.add(new Student("lukky" , 15));
        set.add(new Student("raj" , 9)); /*same<-duplicate records are not Allowed,but object alag-alag ban rhe
                                           h isley store ho jayega.*/
        System.out.println(set);                                   
    }
}
class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}
//OUTPUT: [vikki - 12, raj - 9, lukky - 15, hritik - 12, ratnesh - 18, raj - 9]