class D {
    //instance-level method member
    void pro() {
        System.out.println(this + "************");
        info(this);
    }
    //non-instance level method
    static void info(D x ) {
        System.out.println(x + "~~~~~~~~~~~~");
    }
    //main method 
    public static void main(String[] args) {
        D d = new D();
        
        System.out.println(d + "------------");
        d.pro();
    }
}
/* OUTPUT: 
D@4a574795------------
D@4a574795************
D@4a574795~~~~~~~~~~~~
NOTE: instance-level method k andar static method ko "this" keyword ka use kr k call kr sakte h, notice that 
method k andar obj. ref. var. pass nhi kr sakte,lekin same object ka ref. code method k andar print kr sakte h
or same ref. code hi print hua h kyuki wo ref. code 1 hi object ka h or different method us ref. code ko print kr
rhi h.  */ 