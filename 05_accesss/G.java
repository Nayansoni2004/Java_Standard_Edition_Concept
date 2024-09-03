class G {
    //main method...
    public static void main(String[] args) {
        pro();
    }
}

class D {
    void pro() {
        System.out.println("Hello Aman Bhaiya...");
    }
}
//pro(); D class ka method h aisa usko batana padega ki pro(); method G class ka nhi h.
//G.java:4: error: cannot find symbol
//        pro();
//        ^
//  symbol:   method pro()
//  location: class G
//1 error