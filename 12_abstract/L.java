abstract class L {

    //method member...
    final abstract void kfc();

}
/* L.java:4: error: illegal combination of modifiers: abstract and final
    final abstract void kfc();
                        ^
1 error

REASON 1:
error aai kyuki method ko final or abstract modifier dono se mark nhi kr sakte,kyuki final method ko inheritance
k through access nhi kr sakte or abstract method ko instantiation k through access nhi kr sakte,dono keywords
opposite h.

REASON 2: adhuri(incomplete) method complete kaise ho sakti h,matlab adhuri(abstract) method final nhi ho sakti.
REASON 3: abstract method ko final mark nhi kr sakte,kyuki final method ko modify nhi kr sakte,or child class m
        modify to krna padega,isley method ko abstract or final dono ek sath mark nhi kr skate.
REASON 4: bina modification k abstract method possible nhi h,final mark kr dene se modify hi nhi hogi,or 
          modification kewal child class kr sakta h,agar final or abstract dono mark kr denge to child class
          modify nhi kr payega.
    CONC.: isley method ko abstract or final dono mark nhi kr sakte.
*/