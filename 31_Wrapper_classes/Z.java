class Z {
    //main method
    public static void main(String[] args) {
        String x = Integer.toOctalString(12); //Method[I]
        
        String y = Integer.toString(12, 8); //Method[II]

        System.out.println("Method[I]: " + x);
        System.out.println("Method[II]: " + y);
    }
}
/*OUTPUT:
Method[I]: 14
Method[II]: 14
*/