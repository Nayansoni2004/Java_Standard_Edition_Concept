class A1 {
    //members
    static int e = 8;
    int y = 5;

    static void aa() { }

    void bb() { }
}

class A2 extends A1 {
    //members
    static float q;
    boolean j;
    
    static void qq() { }

    void ww() { }
}

class P {
    //main method
    public static void main(String[] args) {
        A2 x = new A2();

    }
}
/*  happily compiled.......
is code m static variables ko class load hone pr jo ClassObject banega usme 1 bar hi load honge or sirf 1 bar hi
initialize honge,or static methods bhi class load hone pr jo ClassObject banega usme 1 bar hi load honge,or sirf
1 bar register honge.
    explanation through stack memory in java-copy P.java example. */ 