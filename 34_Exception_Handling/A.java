class A {
    //main method
    public static void main(String[] args) throws MyException {

        throw new MyException();

    }
}

//Custom Exception Class...
class MyException extends Exception {

}

/*OUTPUT:
D:\javaprac\34_Exception_Handling>java A
Exception in thread "main" MyException
        at A.main(A.java:5)
 */