//Multiple Inheritance : (Java supports multiple inheritance)

class X4 {
    void a1() {
        System.out.println("a1() in X4 class");
    }
}

interface X5 {
    void a2();
}

interface X6 {
    void a3();
}

class H1 extends X4 implements X5, X6 {
    public static void main(String[] args) {
        H1 x = new H1();

        x.a1();
        x.a2();
        x.a3();
    }

    public void a2() {
        System.out.println("a2() in X5 interface");
    }

    public void a3() {
        System.out.println("a3() in X6 interface");
    }
}
/*
D:\github_repos\javapractice\15_inheritance> java H1
a1() in X4 class
a2() in X5 interface
a3() in X6 interface
 */