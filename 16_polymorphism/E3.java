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

class E3 {
    public static void main(String[] args) {
        Object x = new Y3();

        x.laugh();
        x.walk();
        x.talk();
        System.out.println(x.toString());
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> javac E3.java
E3.java:23: error: cannot find symbol
        x.laugh();
         ^
  symbol:   method laugh()
  location: variable x of type Object
E3.java:24: error: cannot find symbol
        x.walk();
         ^
  symbol:   method walk()
  location: variable x of type Object
E3.java:25: error: cannot find symbol
        x.talk();
         ^
  symbol:   method talk()
  location: variable x of type Object
3 errors
 */