class T {
    //instance level var. member
    //int x = 2;
}

class H2 extends T {
    //instance level var. member
    int x = 7;

    void pro() {
        //int x = 12; //local var. bec. method k andar bana h.

        System.out.println(x);
    }
    //main method
    public static void main(String[] args) {
        H2 h = new H2();

        h.pro();
    }
}
/* D:\javaprac\19_redefine>java H2
7
*/