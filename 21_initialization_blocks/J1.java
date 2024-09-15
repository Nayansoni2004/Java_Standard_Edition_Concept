class J1 {
    //instance-level method member
    void pro() {
        System.out.println(x);
    }
    //instance-level var. member
    int x = 90;
}
//happily compiled....instance-level var. member ko method k pahle declare kro ya baad m,order matter nhi krta,
//baad m declare kr denge to bhi method k andar accessible hoga...