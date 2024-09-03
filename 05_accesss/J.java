class J extends D {

    // main method....
    public static void main(String[] args) {
        J j = new J();
        
        j.pro();

        System.out.println(j.w);
    }
}

class D {
    double w = 9.6;

    void pro() {
        System.out.println("Hello JAVA...");
    }
}
//variable ko v access kr liya or method ko v access kr lia object k through!!!
//HAPPILY COMPILED..
//OUTPUT:
//Hello JAVA...
//9.6