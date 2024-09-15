class Z1 extends Object {
    //programmer supplied constructor
    Z1() {
        System.out.println("I");
    }
}

class Z2 extends Z1 {
    //programmer supplied constructor
    Z2() {
        System.out.println("S");
    }
}

class Z3 extends Z2{
    //programmer supplied constructor
    Z3() {
        System.out.println("H");
    }
}

class Z4 extends Z3 {
    //programmer supplied constructor
    Z4() {
        System.out.println("T");
    }
}

class H1 {
    //main method 
    public static void main(String[] args) {
        System.out.println("D");
        System.out.println("R");

        Z4 x = new Z4();

        System.out.println("I");
    }
}
/*  this code is executed using stack process and object creation in heap memory...
D
R
I
S
H
T
I
*/