import java.io.IOException;

class U3 {
    //main method
    public static void main(String[] args) throws Throwable {

        System.out.println(1);

        if(12 < 13) {
            throw new Throwable();
        }

        System.out.println(2);
    }
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>java U3
1
Exception in thread "main" java.lang.Throwable
        at U3.main(U3.java:10)

 */