class P5 {

    //main method
    public static void main(String[] args) {

        final String name;  //uninitialized variable

        System.out.println(name);

        final int age = 19;   //initialized variable

        System.out.println(age);

    }
}
/* P5.java:8: error: variable name might not have been initialized
        System.out.println(name);
                           ^
1 error
*/