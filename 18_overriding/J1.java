class C2 {
    private void pro() {
        System.out.println("HI");
    }
}

class D2 extends C2 {
    void pro() {
        System.out.println("Hello");
    }
}

class J1 {
    public static void main(String[] args) {
        C2 x = new D2();

        x.pro();
    }
}
/* child class D2 is unaware or parent class method, since parent class method is private & not inheritable so 
child D2 can make its own method with the same name & its not overriding bec. child has its own method not 
redefining the one present in parent class. */

/*compilation error..........
J1.java:17: error: pro() has private access in C2
        x.pro();
         ^
1 error

📌 Key Concept:
Private methods are not inherited, so no overriding happens. And you can’t call private methods from outside their class.
 */