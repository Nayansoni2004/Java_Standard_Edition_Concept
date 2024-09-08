//package declaration.
package x.y;

class C {

    //main method
    public static void main(String[] args){

        B x = new B();

        x.pro();
    }
}
/* x\y\C.java:11: error: pro() has protected access in A
        x.pro();
         ^
1 error

B class A class k protected member ko child banke or apne hi object k through access kr lega ,,but C class B 
class ka object banake us member ko access nhi kr sakta,  */ 