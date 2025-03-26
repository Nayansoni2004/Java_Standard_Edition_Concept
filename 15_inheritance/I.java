//Multilevel Inheritance

class Y1 {
    void a1() {
        System.out.println("a1() in Y1");
    }
}

class Y2 extends Y1 {
    void a2() {
        System.out.println("a2() in Y2");
    }
}

class Y3 extends Y2 {
    void a3() {
        System.out.println("a3() in Y3");
    }
}

class I {
    public static void main(String[] args) {
        Y3 x = new Y3();

        x.a1();
        x.a2();
        x.a3();
    }
}
/*
D:\github_repos\javapractice\15_inheritance> java I
a1() in Y1
a2() in Y2
a3() in Y3
 */