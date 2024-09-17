class E {
    //main method
    public static void main(String[] args) {
        char a = 'A';

        String x = a.toString();

        System.out.println(x);
    }    
}
/*OUTPUT:E.java:6: error: char cannot be dereferenced
        String x = a.toString();
                    ^
1 error 
*/