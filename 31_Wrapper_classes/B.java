class B {
    //main method
    public static void main(String[] args) {
        boolean a = true;

        String x = a.toString();

        System.out.println(x);
    }    
}
/*OUTPUT:B.java:6: error: boolean cannot be dereferenced
        String x = a.toString();
                    ^
1 error 
*/