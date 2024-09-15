class R {

    //programmer supplied constructor...
    abstract R() {

    }
}
/* R.java:4: error: modifier abstract not allowed here
    abstract R() {
             ^
1 error

REASON 1:constructor ko abstract mark nhi kr sakte,kyuki abstract class ko kewal inheritance k through access 
kr sakte h or constructor inherit nhi hoga kisi or class m.
REASON 2:constructor ko abstract mark nhi kr sakte,kyuki kisi or class k andar kisi class ka constructor inherit
hi nhi hota to usko definition kese provide krenge ki or class k andar.
isley constructor ko abstract mark nhi kr sakte kyuki kisi or class k andar constructor ko define nhi kr sakte!!!
*/