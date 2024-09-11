class E {

    double w = 2.3f;//variable declaration cum initialization

    void info() {
        System.out.println("E class info method is accessed...");
    }
}

class C2 extends E {

    void info() {
        System.out.println("C2 class info method is accessed!!!");
    }
    
    //main method 
    public static void main(String[] args) {

        C2 x = new C2();

        System.out.println(x.w);

        x.info(); 
    }
}
/* OUTPUT:-2.299999952316284
C2 class info method is accessed!!!
*/