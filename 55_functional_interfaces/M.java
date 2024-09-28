abstract class X9 {
    abstract void pro();
}

class M {
    //main method
    public static void main(String[] args) {
        X9 x = () -> System.out.println("HI Ji !!!");//lambda expression

        x.pro();
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac M.java
M.java:8: error: incompatible types: X9 is not a functional interface
        X9 x = () -> System.out.println("HI Ji !!!");//lambda expression
               ^
1 error
 */