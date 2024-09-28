@FunctionalInterface
interface Y2 {
    void aaa(int x, int y);
}

/*class U2 implements Y2 {
    public void aaa(int x, int y) {
        System.out.println(x + " - " + y);
    }
}*/

/*public void aaa(int x, int y) {
    System.out.println(x + " - " + y);
}

(x,y) -> System.out.println(x + " ~~~ " + y) */

class H {
    //main method
    public static void main(String[] args) {
        //Y2 t = new U2();//<-polymorphic assignment...
        Y2 t = (x,y) -> System.out.println(x + " ~~~~ " + y);

        //t.aaa(45, 67);
        t.aaa(22, 44);
    } 
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac H.java

D:\javaprac\55_functional_interfaces>java H
45 - 67 <-normal overriding method ka output...

D:\javaprac\55_functional_interfaces>javac H.java

D:\javaprac\55_functional_interfaces>java H
22 ~~~~ 44 <-lambda expression ka output...
 */