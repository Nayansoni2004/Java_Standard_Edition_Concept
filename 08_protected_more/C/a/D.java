//package declaration
package a;

//import statement
import x.y.B;

class D extends B {

    //main method
    public static void main(String[] args) {

        //B x = new B(); 
        
        D x = new D();

        x.pro();
    }
}

/* OUTPUT WHEN OBJECT OF B CLASS IS CREATED:
   a\D.java:16: error: pro() has protected access in A
        x.pro();
         ^
1 error

B class A class ka protected member child banke apne hi object k through protected member ko access kr rhi h
or B class jub public mark h or D class B class ka object banake us member ko access kr rhi h or kyuki B class 
different package m h or D class different package m h to B class ka object banake us member ko access nhi kr sakti.
*/   
/* OUTPUT WHEN OBJECT OF D CLASS IS CREATED:
   protected member is accessed.
   
B class different package m h or D class different package m h isley D class kewal apna hi object banake us 
member ko access kr sakti h. */ 