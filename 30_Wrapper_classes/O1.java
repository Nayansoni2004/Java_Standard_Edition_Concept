class O1 {
    //main method
    public static void main(String[] args) {
        Byte b1 = 128;
        Byte b2 = 128;

        System.out.println(b1 == b2);
    }    
}
/*OUTPUT:
O1.java:4: error: incompatible types: int cannot be converted to Byte
        Byte b1 = 128;
                  ^
O1.java:5: error: incompatible types: int cannot be converted to Byte
        Byte b2 = 128;
                  ^
2 errors
*/