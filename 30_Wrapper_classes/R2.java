class R2 {
    //main method
    public static void main(String[] args) {
        byte x = Byte.parseByte("1a2");

        System.out.println(x);
    }    
}
/*OUTPUT:
Exception in thread "main" java.lang.NumberFormatException: For input string: "1a2"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Byte.parseByte(Byte.java:193)
        at java.base/java.lang.Byte.parseByte(Byte.java:219)
        at R2.main(R2.java:4)
*/