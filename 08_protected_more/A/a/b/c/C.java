//package declaration
package a.b.c;

class C extends A {

    //main method
    public static void main(String[] args) {
        
        //C x = new C();

        A x = new A();

        x.pro();
    }
}
/* 
OUTPUT:protected member is accessed.

A class ka member protected h or C class chid h A class ka to inheritance k through hum, jub parent class ka 
member protected h to A class ka object bna k bhi us member ko access kr sakte h or child class ka member ban
bhi access kr sakte h ,,dono hi legal h.

*/