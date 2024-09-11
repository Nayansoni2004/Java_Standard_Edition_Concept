//final(pora,complete) keyword example no.8
/*final*/ class R {

    void aaa() {
        System.out.println("aaa method from class R");
    }
//bbb method is only marked as final.
    final void bbb() {
        System.out.println("bbb method from class R");
    }

    void ccc() {
        System.out.println("ccc method from class R");
    }
}

class J extends R {

    void aaa() {
        System.out.println("aaa method from class J");
    }

    void bbb() {
        System.out.println("bbb method from class J");
    }
    
    void ccc() {
        System.out.println("ccc method from class J");
    }
    //main method 
    public static void main(String[] args) {

        J j = new J();

        j.aaa();
        j.bbb();
        j.ccc();
    }
}
/* j.java:23: error: bbb() in J cannot override bbb() in R
    void bbb() {
         ^
  overridden method is final
1 error

R class m bbb() method final marked h isley bbb() method ko child class J m access to kr sakte h,lekin modification
allowed nhi h,isley modify nhi kr sakte.  
*/