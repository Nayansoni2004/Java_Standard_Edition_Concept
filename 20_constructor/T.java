class WW {
    //programmer supplied constructor
    private WW() {

    }
}

class T extends WW {

}
/* T.java:8: error: WW() has private access in WW
class T extends WW {
^
1 error

error aai kyuki T class m default constructor hoga,or uska first line statement super(); call hoga to wo super();
WW class k constructor ko call krega lekin WW class ka constructor private h jo ki kewal WW class k andar 
accessible or constructor inherit bhi nhi hota isley to T()constructor access nhi kr payega,isley error aai!
*/