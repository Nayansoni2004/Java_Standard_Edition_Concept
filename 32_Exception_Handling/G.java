class G {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem Solved...");
        }

        System.out.println(3);
    }  
}
//input: mohan
//input: nothing

/*OUTPUT:
D:\javaprac\32_Exception_Handling>java G
1
Problem Solved...
3

D:\javaprac\32_Exception_Handling>java G mohan
1
mohan
3
*/