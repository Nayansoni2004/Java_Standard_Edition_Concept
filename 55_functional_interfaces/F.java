@FunctionalInterface 
interface X4 {
    void pro();    
}

class F {
    //main method
    public static void main(String[] args) {
        X4 x = new X4();//<-interface Object...

        x.pro();
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac F.java
F.java:9: error: X4 is abstract; cannot be instantiated
        X4 x = new X4();//<-interface Object...
               ^
1 error
 */