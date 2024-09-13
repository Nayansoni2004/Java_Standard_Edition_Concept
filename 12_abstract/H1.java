abstract class X6 {

    //method declaration
    abstract void abc();

}

abstract class H1 extends X6 {

    void abc() {

    }

}
class H2 {
     //main method 
    public static void main(String[] args) {

        H1 h;  //H1 class ka variable...
    }
}
/* OUTPUT: happily compiled and runed 

abstract class ko instantiation k through (object bana k access nhi kr sakte).or bhale hi class m sari methods
complete ho phir bhi class ko abstract isley mark kr dia jata h,taki us class ka koi object banake access na kr 
le ,kewal inheritance k through hi access kr paye.
*/ 
