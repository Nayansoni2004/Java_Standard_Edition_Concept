@FunctionalInterface 
interface Y2 {
    void info(int x);
}

/*class U1 implements Y2 {
    public void info(int e) {
        System.out.println("Hello " + e);
    }
} */

/*
public void info(int e) {
    System.out.println("Hello " + e);
}

e -> System.out.println("Hello " + e);
*/

class G {
    //main method
    public static void main(String[] args) {
        //Y2 a = new U1();//<-polymorphic assignment..

        Y2 a = e -> System.out.println("Hello " + e);

        //a.info(333);
        a.info(11);
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac G.java

D:\javaprac\55_functional_interfaces>java G
Hello 333 <-normal overriding method output...

D:\javaprac\55_functional_interfaces>javac G.java

D:\javaprac\55_functional_interfaces>java G
Hello 11 <-lambda expression output...
 */