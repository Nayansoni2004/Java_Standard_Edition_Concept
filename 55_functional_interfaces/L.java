interface X7 {
    void pro();
    void info();
}

class L {
    //main method
    public static void main(String... args) {
        X7 x = () -> System.out.println("Hello ji !!"); //<-lambda expression

        x.pro();
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac L.java
L.java:9: error: incompatible types: X7 is not a functional interface
        X7 x = () -> System.out.println("Hello ji !!"); //<-lambda expression
               ^
    multiple non-overriding abstract methods found in interface X7
1 error
 */