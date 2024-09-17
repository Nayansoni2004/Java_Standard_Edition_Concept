class Y1 {
    //instance-level var. member
    int x = 88; //parent class ka instance var.
}

class G extends Y1 {
    //(non-static)var.
    int x = 33; //instance var.
    //instance-level method member
    void pro() {
        int x = 22; //local var.

        System.out.println(x);
    }
    //main method 
    public static void main(String[] args) {
        G g = new G();

        g.pro();
    }
}
/* OUTPUT: 22
method ko call krne pr 1st priority method k andar k local var. ko milti h,then 2nd priority class k instance 
var. ko milti h, then 3rd priority parent class k instance var. ko milti h. */