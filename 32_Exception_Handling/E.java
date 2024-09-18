class E {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int x = 12/0;
        } catch(ArithmeticException e) {
            System.out.println("Problem Solved");
        }
        
        System.out.println(3);
    }    
}
/*OUTPUT:
1
Problem Solved
3
*/