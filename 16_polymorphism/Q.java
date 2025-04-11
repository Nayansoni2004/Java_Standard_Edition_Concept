class Q {
    public static void main(String[] args) {
        Teacher x = new Teacher();
        attendance(x);

        Student y = new Student();
        attendance(y);
    }

    static void attendance(Teacher t) {
        System.out.println("Present");
    }

    static void attendance(Student t) {
        System.out.println("Present");
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> java Q
Present
Present
 */

/*
The Q class has a main method where:

A Teacher object (x) and a Student object (y) are created.

The overloaded attendance() method is called twice — once with a Teacher and once with a Student.

Method Resolution:
Java resolves method overloading at compile time based on the parameter type.

Key Point:
Even though both Teacher and Student implement User, interface User isn't used here for polymorphism — the code uses class-specific method overloading instead.
 */