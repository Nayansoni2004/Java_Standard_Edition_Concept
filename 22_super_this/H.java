class Y1 {
    //instance-level var.
    int x = 99; //parent class ka instance var.
}

class H extends Y1 {
    //instance-level var.
    int x = 86; //child class ka instance var.
    //instance-level method
    void info() {
        int x = 69; //local var.

        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    //main method
    public static void main(String[] args) {
        H h = new H();
        
        h.info();
    }
}
/* OUTPUT: 
69
86
99
method ko call krne pr 1st priority method k andar k local var. ko milti h,then 2nd priority class k instance 
var. ko milti h, then 3rd priority parent class k instance var. ko milti h. agar current class k instance var.
ko method k andar call krna h to this.var.name likh k call krna padega,or agar child class ki method k andar 
parent class k instance var. ko call krna h to super.var.name likh k call krna padega. */