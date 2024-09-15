class Q {

    //programmer supplied constructor
    final Q() {

    }
}
/* Q.java:4: error: modifier final not allowed here
    final Q() {
          ^
1 error

constructor ko final mark nhi kr sakte, kyuki jub kisi class ka object banaya jata h to us class k constructor ko
call kia jata h jo ki object ko initialize krne ka kam krta h,or kyuki final mark kr dene se usko redefine nhi
kr sakte because constructor m object k variables ki value set hoti h,agar constructor final mark kr de,to us m
object k variables ki value set nhi ho sakti,or isley object nhi ban payega,isley constructor ko final mark nhi 
kr sakte,illegal h.
*/