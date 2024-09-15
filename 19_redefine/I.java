// USE OF this AND super KEYWORD.
class U {
    //instance level var. member
    int x = 12;
}

class I extends U {
    //instance level var. member
    int x = 19;

    void pro() {
        int x = 24;  //local var. bec. method k andar bana h.

        System.out.println(x); //local var. print hoga.
        System.out.println(this.x); //current object ka member print hoga.
        System.out.println(super.x); //parent ka instance member print hoga.
    }
    //main method
    public static void main(String[] args) {
        I h = new I();

        h.pro();
    }
}
/* D:\javaprac\19_redefine>java I
24
19
12
*/