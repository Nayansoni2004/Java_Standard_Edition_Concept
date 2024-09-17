class A {
    //main method
    public static void main(String[] args) {
        A x1 = new A();
        A x2 = new A();
        A x3 = new A();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
/* OUTPUT:
A@4617c264
A@36baf30c
A@7a81197d
NOTE: obj. ref. var. ko print krne pr us object ka  hexadecimal ref. code print hota h. 
har obj. ref. var. ka hexadecimal ref. code alag-alag hota h,kyuki do object ka ref. code
same nhi ho sakta,agar same hoga to compiler identify nhi kr payega ki tum kis object ko 
call/access krne k khwaab dekh rhe ho.isley jitne obj. honge subka ref. code alag-alag hoga. */
