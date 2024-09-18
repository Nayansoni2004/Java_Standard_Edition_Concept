class Z {
    //main method
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");

        try {
            System.out.println("D");
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("E");
        System.out.println("F");

        try {
            System.out.println("G");
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("H");
        System.out.println("I");
    } 
}
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java Z
A
B
C
D
E
F
G
H
I
*/