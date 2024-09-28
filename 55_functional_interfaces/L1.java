interface X8 {
    void pro();
    void info(int y);
}

class L1 {
    //main method
    public static void main(String[] args) {
        X8 x = () -> System.out.println("Hello ji !!"); //lambda expression

        x.pro();
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac L1.java
L1.java:9: error: incompatible types: X8 is not a functional interface
        X8 x = () -> System.out.println("Hello ji !!"); //lambda expression
               ^
    multiple non-overriding abstract methods found in interface X8
1 error
 */