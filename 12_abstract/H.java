abstract class X5 {

    //method declaration
    abstract void mno();

}

class H extends X5 {

    void mno() {

    }

}
/* OUTPUT:  happily compiled 
 abstract class ka object nhi bana sakte,lekin abstract class ko inheritance k through access kr sakte h,but
 child class ko abstract mark krna padega ya phir sub-class m abstract class ki methods ko definition provide 
 krna padega....or H.java m child class m abstract class ki method ko define kia h isley child class ko abstract
 mark nhi krna pada,kyuki class ko jub abstract mark krte h jub koi class adhuri hoti h,or H class complete class
 h isley abstract mark nhi krna pada...
*/