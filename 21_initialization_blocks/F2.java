class F2 {
    //instance-level INITIALIZATION BLOCKS
    {
        System.out.println("E");
    }

    {
        System.out.println("L");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    F2() {
        this(23);
        System.out.println("A");
    }    
    //programmer supplied(ONE PARAMETERIZED)constructor
    F2(int y) {
        System.out.println("Q");
    }
    //main method 
    public static void main(String[] args) {
        System.out.println("R");
        F2 x = new F2();
        System.out.println("B");
    }

    {
        System.out.println("8");
    }
}
/* OUTPUT:
R
E
L
8
Q
A
B
*/