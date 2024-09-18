class A {
    //main method
    public static void main(String[] args) {
        System.out.println("A");

        try {
            System.out.println("B");
            try {
                System.out.println("B");
            } catch(Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("C");
            }
        } catch(Exception e) {
            System.out.println("Exception");
            try {
                System.out.println("B");
            } catch(Exception e1) {
                System.out.println("Exception");
            } finally {
                System.out.println("C");
            }
        } finally {
            System.out.println("C");
            try {
                System.out.println("B");
            } catch(Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("C");
            }
        }

        System.out.println("D");
    }
}
/*OUTPUT:
A
B
B
C
C
B
C
D
 */