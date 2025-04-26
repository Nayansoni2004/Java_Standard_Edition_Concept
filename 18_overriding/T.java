interface XY {
    void pro();
}

class T implements XY {
    /*public*/ void pro() {

    }
}
/* because interfaces methods are implicitely public and a class implementing the interface method must declare 
the method as public to, here the method is not declared as public and having the default access control which 
is narrower so compilation fails.

T.java:6: error: pro() in T cannot implement pro() in XY
    void pro() {
         ^
  attempting to assign weaker access privileges; was public
1 error
 */