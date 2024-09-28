@FunctionalInterface
interface Y3 {
    int bbb(int x, int y);
}

class N {
    //main method
    public static void main(String[] args) {
        Y3 z = (a, b) -> a + b;//lambda expression

        //System.out.println(z.bbb(55, 44));
        System.out.println(z.bbb(55.44f, 44));
    }    
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac N.java
N.java:12: error: incompatible types: possible lossy conversion from float to int
        System.out.println(z.bbb(55.44f, 44));
                                 ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
 */