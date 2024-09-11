class D {

    char c = 'A';//variable declaration cum initialization

    void abc() {
        System.out.println("Hello");
    }
}

class C3 extends D {

    void abc() {
        System.out.println("Hii");
    }
    
    //main method 
    public static void main(String[] args) {

        C3 x = new C3();

        System.out.println(x.c);

        x.abc();
    }
} 
/* OUTPUT:-A
Hii
*/