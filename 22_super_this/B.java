class B {
    //instance-level method member
    void pro() {
        System.out.println(x);
    }
    //main method
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}
/* B.java:4: error: cannot find symbol
        System.out.println(x);
                           ^
  symbol:   variable x
  location: class B
1 error
error aai kyuki method k andar obj. ref. var. nhi rakh sakte,mtlb method k andar print statement m object ka ref.
jo ki obj. ref. var. hold krta h us var. ko as a argument method k andar pas nhi kr sakte. */