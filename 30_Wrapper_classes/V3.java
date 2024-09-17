class V3 {
    //main method
    public static void main(String[] args) {
        float x = Float.parseFloat("2.3a");

        System.out.println(x);
    }    
}
/*OUTPUT:Exception in thread "main" java.lang.NumberFormatException: For input string: "2.3a"
        at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
        at java.base/java.lang.Float.parseFloat(Float.java:476)
        at V3.main(V3.java:4)
*/