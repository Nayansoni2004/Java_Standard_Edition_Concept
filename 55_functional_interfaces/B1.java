@FunctionalInterface 
interface B1 {
    void pro();
    void info();
}


/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac B1.java
B1.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  B1 is not a functional interface
    multiple non-overriding abstract methods found in interface B1
1 error
 */