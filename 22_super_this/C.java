class C {
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
        System.out.println(x);
        System.out.println(y);
        System.out.println(g);
        info();
    }
    //main method
    public static void main(String[] args) {
        C x = new C();
        x.pro();
    }
}
/* C.java:13: error: cannot find symbol
        System.out.println(x);
                           ^
  symbol:   variable x
  location: class C
1 error
error line no. 13 pe aai kyuki method k andar obj. ref. var. jo ki object ka ref. code hold krta h usko as a 
argument pass nhi kr sakte,mtlb method k andar obj. ref. var. print statement m pass nhi kr sakte. */