@FunctionalInterface
interface Y3 {
    int bbb(int x, int y);
}
 
/*class U3 implements Y3 {
    public int bbb(int a, int b) {
        return a + b;
    }
} */

/*public int bbb(int a, int b) {
    return a + b;
}

(a, b) -> a + b; */

class I {
    public static void main(String[] args) {
        //Y3 z = new U3();//<-polymorphic assignment...
        Y3 z = (a, b) -> a + b; //<-lambda expression...

        //System.out.println(z.bbb(12, 13));
        System.out.println(z.bbb(55, 44));
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac I.java

D:\javaprac\55_functional_interfaces>java I
25 <-normal overriding method ka output...

D:\javaprac\55_functional_interfaces>javac I.java

D:\javaprac\55_functional_interfaces>java I
99 <-lambda expression ka output...
 */