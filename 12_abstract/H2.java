abstract class X7 {

    //method declaration
    abstract void abc();

}

abstract class H2 extends X7 {
    //main method 
    public static void main(String[] args) {


    }

    void abc() {

    }

}
/* OUTPUT: happily compiled and runed

POINT1: abstract class ka object nhi bana sakte,matlab abstract class ko instantiation k through access nhi kr 
sakte,but inheritance k through access kr sakte h.
imp. POINT2: bhale hi class m sari methods well defined or complete ho ,lekin phir bhi us class ko abstract mark
kr dia jata h,taki koi us class ka object na bana le or instantiation k through access na kr le,kewal inheritance 
k through matlab sub-class banake hi access kr paye.
*/
