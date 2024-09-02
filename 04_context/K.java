class K {
    
    String n = "Drishti";

    //main method...
    public static void main(String[] args) {
        K x = new K();

        x.pro();
    }

    void pro() {
        System.out.println(x.n);
    }
}
//kaisa x kaha ka x....me kisi x ko nhi janta.
//K.java:13: error: cannot find symbol
//        System.out.println(x.n);
//                           ^
//  symbol:   variable x
//  location: class K
//1 error