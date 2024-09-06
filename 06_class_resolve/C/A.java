class A {
    //main method...
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.u);
    }
}
/*
class B {
    int u = 34;
}*/

//OUTPUT:344
//output 344 isley aaya kyuki compiler ko A.java file m B.class nhi mili isley compiler 
//ne B.java k andar se B.class file access kri.