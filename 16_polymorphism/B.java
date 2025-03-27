class B {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new A();
        Object c = new B();
        Object d = new C();
    }
}

//compile A.java then B.java

/*
happily compiled...

Demonstrated polymorphism using Object class references to store instances of different classes (A, B, and C), successfully compiled and executed without output.

PS D:\github_repos\javapractice\16_polymorphism> javac A.java
PS D:\github_repos\javapractice\16_polymorphism> javac B.java
PS D:\github_repos\javapractice\16_polymorphism> java B
PS D:\github_repos\javapractice\16_polymorphism> 
 */