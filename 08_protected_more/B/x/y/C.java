/* concept of this code: B class ne jo A class ka protected member child banke access kia h us member ko ab C 
   class, B class ka object banake access kr pata h ya nhi dekhte h, kyuki B class or C class same package 
   location m h  */

//package declaration
package x.y;

class C {

    //main method 
    public static void main(String[] args) {

        B x = new B();

        x.pro();
    }
}
/* x\y\C.java:15: error: pro() has protected access in A
        x.pro();
         ^
1 error
conclusion: C class B class ka object to bna lega legal h, but member ko access nhi kr payega kyuki wo member A 
            class ka h or protected h or different package location m protected member ko kewal child banke access
            kr sakte h.  */