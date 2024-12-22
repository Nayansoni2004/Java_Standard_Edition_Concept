import java.util.HashSet;
class J {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student("hritik" , 12));
        set.add(new Student("ratnesh" , 18));
        set.add(new Student("raj" , 9));
        set.add(new Student("vikki" , 12));
        set.add(new Student("lukky" , 15));

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

    public String toString() { /*kyuki toString() humne apni class m meaningfully override kia h,isley ref. code
                                 nhi name or age print ho rha h.*/
        return name + " - " + age;
    } 
}
//OUTPUT: [vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9]