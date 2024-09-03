class H {

    //main method...
    public static void main(String[] args) {
        H h = new H();
        h.pro();
    }
}

class D {
    void pro() {
        System.out.println("Hello Duniya Waloon...");
    }
}
//conclusion:jis class ka method access krna h us class ka object banao beta nayan.
//D:\javaprac\5_accesss>javac H.java
//H.java:6: error: cannot find symbol
//        h.pro();
//         ^
//  symbol:   method pro()
//  location: variable h of type H
//1 error