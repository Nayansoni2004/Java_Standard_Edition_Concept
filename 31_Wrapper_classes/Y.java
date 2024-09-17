class Y {
    //main method
    public static void main(String[] args) {
        
        String x = Long.toBinaryString(7);  //Method [I]

        String y = Long.toString(7 , 2);  //Method [II]

        System.out.println("Method [I]: " + x);
        System.out.println("Method [II]: " + y);

    }
}
/*OUTPUT:
Method [I]: 111
Method [II]: 111
*/