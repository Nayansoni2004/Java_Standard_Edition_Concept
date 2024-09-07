/*concept of this code: private member of a class can only be accessed inside a class, and it can't be accessed 
outside the class */
 
//package declaration.
package a;

public class Student {
    private String name = "Drishti";
    
    private int age = 19;

    private void pro() {
        System.out.println(name);
        System.out.println(age);
    }

    void info() {
        pro();
    }

    //main method.
    public static void main(String[] args) {

        Student s = new Student();

        s.info();

        s.pro();

        System.out.println(s.name);

        System.out.println(s.age);
    }
}
/*
OUTPUT:Drishti
19
Drishti
19
Drishti
19
*/
