class P8 {
    //variable members
    final String name;  //uninitialized variable

    P8() {
        name = "DevloperNayan";
    }
    final int age = 19;  //initialized variable

    //main method 
    public static void main(String[] args) {

        P8 p = new P8();

        System.out.println(p.name);

        System.out.println(p.age);
    }
}
/* OUTPUT:
DevloperNayan
19
*/
