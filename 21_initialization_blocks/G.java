class X1 {
    //instance-level INITIALIZATION BLOCKS
    {
        System.out.println("H");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    X1() {
        System.out.println("F");
    }

    {
        System.out.println("O");
    }
}

class G extends X1 {
    //instance-level INITIALIZATION BLOCKS
    {
        System.out.println("1");
    }

    {
        System.out.println("V");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    G() {
        this(23);
        System.out.println("S");
    }
    //programmer supplied(ONE PARAMETERIZED) OVERLOADED CONSTRUCTOR...
    G(int y) {
        System.out.println("Z");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("D");
        G x = new G();
        System.out.println("X");
    }

    {
        System.out.println("U");
    }
}
/* OUTPUT: D H O F 1 V U Z S X   
NOTE: INITIALIZATION BLOCK inherit nhi hote h,kyuki static initialization blocks kewal apni class k classObject
pr run hote h or instance initialization blocks kewal apne instance pr automatic run hote h,isley initialization
blocks constructor ki tarah inherit nhi hote.
lekin X1 class ka constructor super k dwara call hua to X1 class k instance-level initialization blocks bhi auto-
matic run ho gye then constructor ka code jo programmer ne likha tha wo run hua,then wo X1()constructor pop-out
ho gya or integer parameterized constructor ka call resume hua...and as so on....aage stack k through solve hua
code.
*/
