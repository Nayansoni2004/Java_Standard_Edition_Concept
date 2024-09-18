class J {
    //main method
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~1");

        try {

            int i = Integer.parseInt(args[0]);

            System.out.println("~~~~~~~~~~~~2");

        } catch(NumberFormatException e) {

            System.out.println(e);

        }

        System.out.println("~~~~~~~~~~~~~3");

    }  
}
//CommandLine Arguments
//input: 1
//input: 2 
//input: -22
//input: two
//input: <no input>
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java J
~~~~~~~~~~~1
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at J.main(J.java:9)

D:\javaprac\32_Exception_Handling>java J 1
~~~~~~~~~~~1
~~~~~~~~~~~~2
~~~~~~~~~~~~~3

D:\javaprac\32_Exception_Handling>java J 2
~~~~~~~~~~~1
~~~~~~~~~~~~2
~~~~~~~~~~~~~3

D:\javaprac\32_Exception_Handling>java J -22
~~~~~~~~~~~1
~~~~~~~~~~~~2
~~~~~~~~~~~~~3

D:\javaprac\32_Exception_Handling>java J two
~~~~~~~~~~~1
java.lang.NumberFormatException: For input string: "two"
~~~~~~~~~~~~~3
*/