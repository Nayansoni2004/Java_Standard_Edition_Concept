class O2 {
    //main method
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~1");

        try {
            int i = Integer.parseInt(args[0]);

            System.out.println("~~~~~~~~~~~~~~~2");

            int[] x = {3 , 0 , 2};
            int n = x[i];

            System.out.println("~~~~~~~~~~~~~~~~~3");
            System.out.println(n);

            int z = 12/n;
            System.out.println("~~~~~~~~~~~~~~~~4");
            System.out.println(z);

            System.out.println("------------Essential Code-----------------");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "ArrayIndexOutOfBoundsException");

            System.out.println("------------Essential Code-------------");
        } /*catch(ArithmeticException e) {
            System.out.println(e + "ArithmeticException");

            System.out.println("--------------Essential Code----------------");
        }*/ catch(NumberFormatException e) {
            System.out.println(e + "NumberFormatException");

            System.out.println("------------------Essential Code------------------");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~5");
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
D:\javaprac\32_Exception_Handling>java O2
~~~~~~~~~~~~~~~1
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0ArrayIndexOutOfBoundsException
------------Essential Code-------------
~~~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O2 a
~~~~~~~~~~~~~~~1
java.lang.NumberFormatException: For input string: "a"NumberFormatException
------------------Essential Code------------------
~~~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O2 1
~~~~~~~~~~~~~~~1
~~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~~~~3
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at O2.main(O2.java:17)

D:\javaprac\32_Exception_Handling>java O2 2
~~~~~~~~~~~~~~~1
~~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~~~~3
2
~~~~~~~~~~~~~~~~4
6
------------Essential Code-----------------
~~~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O2 0
~~~~~~~~~~~~~~~1
~~~~~~~~~~~~~~~2
~~~~~~~~~~~~~~~~~3
3
~~~~~~~~~~~~~~~~4
4
------------Essential Code-----------------
~~~~~~~~~~~~~~~~~~~5

D:\javaprac\32_Exception_Handling>java O2 3
~~~~~~~~~~~~~~~1
~~~~~~~~~~~~~~~2
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3ArrayIndexOutOfBoundsException
------------Essential Code-------------
~~~~~~~~~~~~~~~~~~~5
 */