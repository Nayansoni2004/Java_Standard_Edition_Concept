class I1 {
    //main method
    public static void main(String[] args) {
        
        Exception x = new ArithmeticException();

        Exception y = new ArrayIndexOutOfBoundsException();

        Exception z = new NumberFormatException();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
/*OUTPUT:
java.lang.ArithmeticException
java.lang.ArrayIndexOutOfBoundsException
java.lang.NumberFormatException
*/