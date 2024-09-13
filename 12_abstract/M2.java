abstract class M2 {

    //method member 
    static void colour() {

    }

}
/* OUTPUT:   happily compiled  

abstract class m complete method ko static mark kr sakte h,absolutely legal h,kyuki class k static members class
load hone pr hi load ho jate h,or unko memory bhi allocate ho jati h,or class name class context create krta h
or class context m static members ko direct access kr sakte h,lekin abstract class ka object nhi bana sakte,
matlab instantiation k through access nhi kr sakte,but inheritance k through access kr sakte h,or phir main method
decide krega kyuki main method static context create krta h,or static context m static members ko access kr sakte 
h,matlab child class ka object bana k access kr skate h.

*/