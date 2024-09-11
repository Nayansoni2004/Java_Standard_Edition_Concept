class L3 {
    //constant variables... 
    final int w;//variable declaration

    final int h = 55;//variable declaration cum initialization
}
/* L3.java:3: error: variable w not initialized in the default constructor
    final int w;//variable declaration
              ^
1 error

1:-agar koi variable ko (constant variable) banana h, to us variable ko final keyword se mark kr do,

2:lekin error isley aai kyuki agar koi variable ko class k andar final mark kia h to us variable ko declaration k
sath kisi value se initialization bhi krna padega, java kehta h ki final declaration variable ko me koi default
value se initialize nhi krunga,tumko khud krna padega,or initialization isley krna necessary h kyuki agar final 
mark kia h to us variable ko modify to nhi kr sakte, but kabhi access to kroge,jub initialization hi nhi hoga
to kya access kroge...
*/