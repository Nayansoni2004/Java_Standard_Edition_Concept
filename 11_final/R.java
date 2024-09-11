class R {
    //main method
    public static void main(String[] args) {

        final int x;  //uninitialized variable

        final int y = 11; //initialized variable

        x = 12;

        System.out.println(y);
        System.out.println(x);

    }
}
/* OUTPUT:   happily compiled and runed...
11
12
*/