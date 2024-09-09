//package declaration 
package a;

//import statement 
//NOTE:- open one import statement at a time.
import b.B;
//import c.d.B;

class A {

    //main method
    public static void main(String[] args) {

        b.B x = new b.B();/* upar import statement m declare kr dia h isley object creation m b.B nhi likhenge to v chalega.*/

        System.out.println(x.name);

        c.d.B y = new c.d.B();

        System.out.println(y.name);
    }
}
/* OUTPUT:nayan
          drishti 
A class b package ki(Bclass) or c.d package ki (Bclass) ko access kr rha h, dono B classes different
package m h or java pechan nhi payega ki tum kis class ka object bna rhe ho isley agar import statement
m bta diya h ki b package ki B class ko access kr rhe h to uska object banate samay ye sath m declare
nhi krna padega ki b package ki B class ka object h ye lekin agar c.d.B import statement m nhi bataya h
to phir object create karte samay ye batana padega ki c.d.B class ka object h ye . */  