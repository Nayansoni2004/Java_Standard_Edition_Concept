class T {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        finally {

        }

        System.out.println(2);
    }
}
/*OUTPUT:
D:\javaprac\32_Exception_Handling>javac T.java
T.java:6: error: 'finally' without 'try'
        finally {
        ^
1 error
 */