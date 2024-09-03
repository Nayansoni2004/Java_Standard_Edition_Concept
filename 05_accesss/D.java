class D {
    //main method....
    public static void main(String[] args) {
        D a = new D();
        System.out.println(a.y);
    }
}

class W {
    int y = 90;
}
//D.java:5: error: cannot find symbol
//        System.out.println(a.y);
//                            ^
//  symbol:   variable y
//  location: variable a of type D
//1 error