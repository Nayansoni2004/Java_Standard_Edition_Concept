class Q1 {

    //main method
    public static void main(String[] args) {

        int x;  //uninitialized variable

        int y = 78;  //initialized variable

        System.out.println(y);
        
        System.out.println(x);

    }
}
/* Q1.java:12: error: variable x might not have been initialized
        System.out.println(x);
                           ^
1 error
*/