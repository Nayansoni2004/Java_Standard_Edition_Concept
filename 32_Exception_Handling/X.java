class X {
    //main method
    public static void main(String[] args) {

        try {
            int x = 12/0;
        } catch(ArithmeticException e) {
            System.out.println(e);

            System.out.println(e.getMessage() + " Throwable class ki method h getMessage() return type String h");
        }
    }
}
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java X
java.lang.ArithmeticException: / by zero
/ by zero Throwable class ki method h getMessage() return type String h
*/