class R {

    void aaa() {
        System.out.println("aaa method from class R");
    }

    final void bbb() {
        System.out.println("bbb method from class R");
    }

    void ccc() {
        System.out.println("ccc method from class R");
    }
}

class J1 extends R {

    void aaa() {
        System.out.println("aaa method from class J");
    }

    /*void bbb() {
        System.out.println("bbb method from class J");
    }*/

    void ccc() {
        System.out.println("ccc method from class J");
    }

    //main method 
    public static void main(String[] args) {

        J1 j = new J1();

        j.aaa();
        j.bbb();
        j.ccc();

    }
}
/* OUTPUT:aaa method from class J
          bbb method from class R
          ccc method from class J
J1 child class m R class ki aaa() or ccc() method ko modify kia h,or bbb() method ko modify nhi kia,isley J1 class
m bbb() method accessible h,or aaa() or ccc() methods ko modification bhi allowed h,bbb() method ko modification
allowed nhi h kyuki R class m bbb()method final marked h,or suna h final marked method ko modify nhi kr sakte,
sahi suna h...
*/