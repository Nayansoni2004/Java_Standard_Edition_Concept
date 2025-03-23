class A1 {
    void laugh() {
        System.out.println("I can Laugh");
    }
}

class A2 extends A1 {
    void talk() {
        System.out.println("I can talk");
    }
}

class A3 extends A2 {
    void walk() {
        System.out.println("I can Walk");
    }
}

class F extends A3 {
    public static void main(String[] args) {
        F x = new F();

        x.walk();
        x.talk();
        x.laugh();
    }
}
/*
Demonstrated multi-level inheritance by accessing parent class methods using a child class object, showcasing method inheritance across multiple levels.

D:\github_repos\javapractice\15_inheritance> java F
I can Walk
I can talk
I can Laugh
 */