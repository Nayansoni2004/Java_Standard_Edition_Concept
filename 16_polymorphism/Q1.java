class Q1 {
    public static void main(String[] args) {
        Teacher x = new Teacher();
        attendence(x);

        Student y = new Student();
        attendence(y);
    }

    static void attendence(User t) {
        System.out.println("Present " + t);
    }

    // static void attendence(Teacher t) {
    //     System.out.println("Present");
    // }

    // static void attendence(Student t) {
    //     System.out.println("Present");
    // }
}
/*
D:\github_repos\javapractice\16_polymorphism> java Q1
Present Teacher@816f27d
Present Student@3e3abc88
 */

/* EXPLANATION:
This code demonstrates runtime polymorphism (also called dynamic method dispatch) through interface-based generalization.

Since t refers to a User, but holds Teacher or Student object,
t.toString() is called, which gives the default output:
Teacher@816f27d → ClassName + @ + hashcode in hex.
Student@3e3abc88 → Same structure.
 */