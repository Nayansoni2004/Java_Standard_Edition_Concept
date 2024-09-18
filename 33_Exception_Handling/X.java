class X {
    //main method
    public static void main(String[] args) { 

        // Integer x = Integer.valueOf("56");

        Integer x = Integer.valueOf("5a6");

        System.out.println(x);
    }
}
/*OUTPUT: output jub upar wali Integer wrapper class ki method ko run kia->
D:\javaprac\33_Exception_Handling>javac X.java

D:\javaprac\33_Exception_Handling>java X
56


OUTPUT: output jub niche wali Integer wrapper class ki method ko run kia->
D:\javaprac\33_Exception_Handling>javac X.java

D:\javaprac\33_Exception_Handling>java X
Exception in thread "main" java.lang.NumberFormatException: For input string: "5a6"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.valueOf(Integer.java:999)
        at X.main(X.java:7)
 */