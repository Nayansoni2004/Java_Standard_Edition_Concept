import java.util.ArrayList;
class S {
    //main method
    public static void main(String[] args) {
        Student a = new Student("kartik", 23);

        System.out.println(a);//object ka ref. code print hoga,kyuki toString() ko Student class m override nhi kia h.
        System.out.println(a.toString());
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
/*OUTPUT: jub toString() method ko Student class m override nhi kia to ye Output aaya.
Student@36baf30c
Student@36baf30c */

/*OUTPUT: jub toString() method ko Student class m override kr dia to ye Output aya.
kartik - 23
kartik - 23 */