class C1 {
    //instance-level var. member
    int y = 99;
    //static(non-instancelevel)var. member
    static float g = 8.8f;

    //instance-level method member
    void info() {
        System.out.println("Hi");
    }
    //instance-level method member
    void pro() {
        //System.out.println(x1);
        System.out.println(y);
        System.out.println(g);
        info();
    }
    //main method
    public static void main(String[] args) {
        C1 x1 = new C1();
        x1.pro();
    }
}
/* OUTPUT:
99
8.8
Hi
method k andar dusri method ko call kr sakte h,absolutely legal h. but method k andar obj. ref. var. pass nhi kr
sakte. */