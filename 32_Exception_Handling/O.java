class O {
    //main method
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~1");

        try {
            int i = Integer.parseInt(args[0]);

            System.out.println("~~~~~~~~~~~~~~2");

            int[] x = {3 , 0 , 2};
            int n = x[i];
            
            System.out.println("~~~~~~~~~~~~~~3");
            System.out.println(n);

            int z = 12/n;

            System.out.println("~~~~~~~~~~~~~~4");
            System.out.println(z);

            System.out.println("-------------Essential Code---------------");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e) {
            System.out.println(e + "ArithmeticException");
        } catch(NumberFormatException e) {
            System.out.println(e + "NumberFormatException");
        }

        System.out.println("~~~~~~~~~~~~~~~~~5");
    }
}
//CommandLine argument
//input: no-input
//input: a
//input: 1
//input: 2
//input: 0
//input: 3
/*OUTPUT:

D:\javaprac\32_Exception_Handling>java O
~~~~~~~~~~~~~1
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0ArrayIndexOutOfBoundsException
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O a
~~~~~~~~~~~~~1
java.lang.NumberFormatException: For input string: "a"NumberFormatException
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O 1
~~~~~~~~~~~~~1
~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~3
0
java.lang.ArithmeticException: / by zeroArithmeticException
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O 2
~~~~~~~~~~~~~1
~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~3
2
~~~~~~~~~~~~~~4
6
-------------Essential Code---------------
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O 0
~~~~~~~~~~~~~1
~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~3
3
~~~~~~~~~~~~~~4
4
-------------Essential Code---------------
~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O 3
~~~~~~~~~~~~~1
~~~~~~~~~~~~~~2
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3ArrayIndexOutOfBoundsException
~~~~~~~~~~~~~~~~~5
*/