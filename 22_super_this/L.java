class T1 {
    //overridden method 
    void pro() {
        System.out.println("pro in parent");
    }
}

class L extends T1 {
    //over-riding method
    void pro() {
        System.out.println("pro in child");
    }
    //instance-level method
    void info() {
        pro();   //child class method call....
        super.pro(); //parent class method call...
    }
    //main method 
    public static void main(String[] args) {
        L l = new L();

        l.info();  //method call...
    }
}
/* OUTPUT: pro in child
           pro in parent
pahle child class k pass agar khud ka re-define method h to wo run hota h,agar child k pass nhi h to parent ka
method run hota h, or info()method m pahle child ki hi method ko call kia h to pahle child ka redefine varsion
run hoga,then super.pro(); parent ka method call kia h to fir parent ka over-ridden method version run hoga. */
