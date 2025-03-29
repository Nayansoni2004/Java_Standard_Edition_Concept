class Y1 {
    void talk() {
        System.out.println("I can talk");
    }
}

class Y2 extends Y1 {
    void walk() {
        System.out.println("I can walk");
    }
}

class Y3 extends Y2 {
    void laugh() {
        System.out.println("I can laugh");
    }
}

class E {
    public static void main(String[] args) {
        Y3 x = new Y3();

        x.laugh();
        x.walk();
        x.talk();
        System.out.println(x.toString());
    }
}
/*
Demonstrated polymorphism using multi-level inheritance, where a Y3 object accessed methods from its own class and inherited methods from parent classes, with toString() showcasing object representation.

D:\github_repos\javapractice\16_polymorphism> java E
I can laugh
I can walk
I can talk
Y3@5674cd4d
 */