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

class E2 {
    public static void main(String[] args) {
        Y1 x = new Y3();

        // x.laugh();
        // x.walk();
        x.talk();
        System.out.println(x.toString());
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> javac E2.java
E2.java:23: error: cannot find symbol
        x.laugh();
         ^
  symbol:   method laugh()
  location: variable x of type Y1
E2.java:24: error: cannot find symbol
        x.walk();
         ^
  symbol:   method walk()
  location: variable x of type Y1
2 errors
 */

/*OUTPUT:
D:\github_repos\javapractice\16_polymorphism> java E2
I can talk
Y3@5674cd4d
 */