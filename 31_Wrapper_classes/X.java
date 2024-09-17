class X {
    //main method
    public static void main(String[] args) {

        String x = Integer.toBinaryString(5); //Method [I]

        String y = Integer.toString(5 , 2); //Method [II]

        System.out.println("Method [I]: " + x);
        System.out.println("Method [II]: " + y);
    }
}
/* OUTPUT:
Method [I]: 101
Method [II]: 101
*/