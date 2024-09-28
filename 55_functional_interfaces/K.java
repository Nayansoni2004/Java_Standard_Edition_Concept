interface X6 {
    void pro();
}

class K {
    //main method
    public static void main(String... args) {
        X6 x = () -> System.out.println("Hello ji !!!");

        x.pro();
    }     
}
/*OUTPUT:interface X6 pr @FunctionalInterface annotation lagana jaruri nhi h,bec. their is only one declared 
         method...

D:\javaprac\55_functional_interfaces>javac K.java

D:\javaprac\55_functional_interfaces>java K
Hello ji !!!
 */