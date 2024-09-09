//package declaration
package a;

//import statement
import b.B;
import c.B;

class A {


}
/* a\A.java:6: error: a type with the same simple name is already defined by the single-type-import of B
import c.B;
^
1 error

error aai kyuki A class m B class ko access kr rhe h or B class b package k andar bhi h or c package k andar bhi 
h aise case m A.java pechan nhi payega ki tum konsi B class k object ko access kr rhe ho, jo b package m rakhi h
usko access kr rhe ho ya jo c package k andar rakhi h usko access kr rhe ho.

isley next folder D k andar dekhenge ki dono B class k object ko kaise access kr sakte h. */