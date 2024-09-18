class H {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(Integer.parseInt(args[0]));
        } catch(NumberFormatException e) {
            System.out.println("Problem Solved...");
        }

        System.out.println(2);
    }
}
//input: 123
//input: abc
/*OUTPUT:
D:\javaprac\32_Exception_Handling>java H 123
1
123
2

D:\javaprac\32_Exception_Handling>java H abc
1
Problem Solved...
2
*/
