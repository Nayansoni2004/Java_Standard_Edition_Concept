class Q {
    //instance-level method
    void pro() {
        Q q = this;
        System.out.println(q);
    }
    //main method
    public static void main(String[] args) {
        Q x = new Q();

        x.pro();

        System.out.println(x);
    }
}
/* OUTPUT: 
Q@4617c264
Q@4617c264
Q()constructor call hoga or uska super();call complete hone k baad instance method run hoga or Q class ka q obj.
ref. var. m "this"mtlb current instance ka ref. code aake assign ho jayega,then obj. ref. var. q ko print krne
se instance ka ref. code print hoga,or uska ref. code aake x var. m hold ho jayega,then x.pro(); method ko call
krne pr bhi same ref. code print hoga or x var. ko print krne pr bhi same ref. code print hoga,kyuki var. x m
rakha to 1 hi object ka ref. code h. isley same ref. code print hoga. */