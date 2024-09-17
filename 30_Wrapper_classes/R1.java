class R1 {
    //main method
    public static void main(String[] args) {
        byte x = Byte.parseByte("128");
    }    
}
/*OUTPUT:
Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
        at java.base/java.lang.Byte.parseByte(Byte.java:195)
        at java.base/java.lang.Byte.parseByte(Byte.java:219)
        at R1.main(R1.java:4)

*/
