class N2 {

    final static int x;//variable declaration
    static final int y = 0101;//variable declaration cum initialization

    N2() {
        x = 100;
    }
}
/* N2.java:7: error: cannot assign a value to final variable x
        x = 100;
        ^
1 error

final variable ko constructor k andar initialization kr sakte h,lekin agar wo variable final static mark h to 
constructor k andar usko initialization nhi kr sakte.kyuki constructor class ka instance level member h or jo ki
class ka object banane pr call hota h,or class k static members ko memory class k load hone pr hi allocate ho jati
h,heap memory m or jub class ka object banaya jayega tab constructor ka call resume hoga,isley constructor k 
andar initialization late ho jayega tab tak to final static var. ko memory allocate ho chuki hogi,or isley is 
initialization ko anonymous code block k andar krna padega,tab initialization successful hoga...jo ki N3.java code
m dekhenge apan.......... 
*/