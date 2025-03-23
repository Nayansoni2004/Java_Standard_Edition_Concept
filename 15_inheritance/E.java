class E {
    public static void main(String[] args) {
        D x = new D();

        System.out.println(x instanceof D);
        System.out.println(x instanceof B);
        System.out.println(x instanceof A);
        System.out.println(x instanceof C);
        System.out.println(x instanceof Object);
        System.out.println(x instanceof X);
        System.out.println(x instanceof Y);
    }
}

interface X {

}

interface Y extends X {

}

class C {

}

abstract class A extends C implements X {

}

class B extends A implements Y {

}

class D extends B {

}
/*
Demonstrated multi-level inheritance and interface implementation, using 'instanceof' to verify object relationships across classes and interfaces.

D:\github_repos\javapractice\15_inheritance> java E
true
true
true
true
true
true
true
 */