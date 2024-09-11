class Q {

    String name ="nayan";//variable declaration cum initialization
    
    void info() {
        System.out.println("info method is accessed");
    }
}

class C1 extends Q {

    void pro() {
        System.out.println("pro method is accessed");
    }

    //main method
    public static void main(String[] args) {

        C1 s = new C1();

        System.out.println(s.name);

        s.pro();
        s.info();
    }
}
/* OUTPUT:-nayan
           pro method is accessed
           info method is accessed
*/