class Z1 {
    //(non-instance-level)variable
    static int t = 98;
}

class K extends Z1 {
    //(non-instance-level)variable
    static int t = 67;
    //(non-instance-level)method
    static void info() {
        int t = 900;
        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }
    //main method
    public static void main(String[] args) {
        info();  //static method ko main method m direct call kr sakte h,legal h!!!
    }
}
/* K.java:13: error: non-static variable this cannot be referenced from a static context
        System.out.println(this.t);
                           ^
K.java:14: error: non-static variable super cannot be referenced from a static context
        System.out.println(super.t);
                           ^
2 errors
error aai kyuki static block(method) k andar "this"or"super" keyword applicable nhi h,isley info()method m "this" 
or "super" nhi likh sakte,to fir child class k instance var. or parent class k instance var. ko kese access 
krenge? this we will see in K1.java source file. */
