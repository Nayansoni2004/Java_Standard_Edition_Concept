class S {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        catch(Exception e) {

        }

        System.out.println(2);
    }
}
/*OUTPUT:
D:\javaprac\32_Exception_Handling>javac S.java
S.java:6: error: 'catch' without 'try'
        catch(Exception e) {
        ^
1 error
*/