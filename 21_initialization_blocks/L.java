class L {
    //programmer supplied(NO-PARAMETERIZED)constructor
    L() {
        System.out.println(x);
        System.out.println(y);
    }
    //instance-level var. member
    int x = 10;
    //static var. member
    static int y = 1;
}
/* constructor class ka instance-level special member function hota h,or constructor k andar instance variable 
or static(non-instance)variable dono ko call/access kr sakte h,order matter nhi krta ki constructor pahle bana h
ya static or instance variables pahle declare h,agar baad m bhi declaration h to bhi access kr sakte h legal h.
*/