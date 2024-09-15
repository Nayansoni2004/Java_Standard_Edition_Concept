//in this example 1-1 kr k comment open krna h niche se or compile krna h!
class T {
    //instance level var. member
    //int x = 2;
}

class H extends T {
    //instance level var. member
    //int x = 7;

    void pro() {
        //int x = 12; //local var. bec. method k andar bana h.

        System.out.println(x);
    }
    //main method
    public static void main(String[] args) {
        H h = new H();

        h.pro();
    }
}
// H.java k aage k versions m isko 1-1 krke dekhenge..in next examples....