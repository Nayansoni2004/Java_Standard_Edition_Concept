class B {
    int x = 10;

    //main method banayenge ab...
    public static void main(String[] args) {
        System.out.println(B.x);
    }
}

//B.java:6: error: non-static variable x cannot be referenced from a static context
//        System.out.println(B.x);
//                            ^
//1 error