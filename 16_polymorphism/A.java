class A {

}

class B extends A {

}

class C extends B {

}

class Test {
    public static void main(String[] args) {
        C x = new C();

        B y = new C();

        A z = new C();

        Object t = new C();
    }
}
/*
Demonstrated polymorphism through upcasting, where objects of subclass C are referenced using parent class types (B, A, and Object), successfully compiled and executed without output.

PS D:\github_repos\javapractice\16_polymorphism> javac A.java
PS D:\github_repos\javapractice\16_polymorphism> java Test
PS D:\github_repos\javapractice\16_polymorphism> 
 */