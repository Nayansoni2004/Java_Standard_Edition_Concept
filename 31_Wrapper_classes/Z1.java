class Z1 {
    //main method
    public static void main(String[] args) {

        String x = Integer.toOctalString(27); //Method[I]

        String y = Integer.toString(27 , 8); //Method[II]

        System.out.println("Method[I]: " + x);

        System.out.println("Method[II]: " + y);

    }    
}
/*OUTPUT:
Method[I]: 33
Method[II]: 33
*/