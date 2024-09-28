//not a Functional interface...

@FunctionalInterface
interface B2 {
    
}


/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac B2.java
B2.java:3: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  B2 is not a functional interface
    no abstract method found in interface B2
1 error
 */