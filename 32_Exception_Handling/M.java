class M {
    //main method
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~1");

        try {
            int i = Integer.parseInt(args[0]);

            System.out.println("~~~~~~~~~~~~~2");

            int[] x = {3 , 0 , 2};
            int n = x[i];
            
            System.out.println("~~~~~~~~~~~~~3");
            System.out.println(n);

            int z = 12/n;
            System.out.println("~~~~~~~~~~~~~~4");
            System.out.println(z);
        } catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            System.out.println(e);
            
            System.out.println("Solution Step 1");
            System.out.println("Solution Step 2");
            System.out.println("Solution Step 3");
        } /* catch(ArithmeticException e) {
            System.out.println("ArithmeticException");

            System.out.println("Solution Step 1");
            System.out.println("Solution Step 2");
            System.out.println("Solution Step 3");
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException");

            System.out.println("Solution Step 1");
            System.out.println("Solution Step 2");
            System.out.println("Solution Step 3");
        } */

        System.out.println("~~~~~~~~~~~~~~~~~5");

    }
}
//CommandLine argument
//input: no input
//input: a
//input: 1
//input: 2
//input: 0
//input: 3
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java M
~~~~~~~~~~1
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
Solution Step 1
Solution Step 2
Solution Step 3
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java M a
~~~~~~~~~~1
java.lang.NumberFormatException: For input string: "a"
Solution Step 1
Solution Step 2
Solution Step 3
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java M 1
~~~~~~~~~~1
~~~~~~~~~~~~~2
~~~~~~~~~~~~~3
0
java.lang.ArithmeticException: / by zero
Solution Step 1
Solution Step 2
Solution Step 3
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java M 2
~~~~~~~~~~1
~~~~~~~~~~~~~2
~~~~~~~~~~~~~3
2
~~~~~~~~~~~~~~4
6
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java M 0
~~~~~~~~~~1
~~~~~~~~~~~~~2
~~~~~~~~~~~~~3
3
~~~~~~~~~~~~~~4
4
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java M 3
~~~~~~~~~~1
~~~~~~~~~~~~~2
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Solution Step 1
Solution Step 2
Solution Step 3
~~~~~~~~~~~~~~~~~5
 */