class P7 {
    //variable members
    final String name;  //uninitialized variable
    name = "DevloperNayan";  //direct initialization without constructor
    
    final int age = 19;   //initialized variable 

    //main method 
    public static void main(String[] args) {

        P7 p = new P7();

        System.out.println(p.age);

        System.out.println(p.name);
    } 
}
/* P7.java:4: error: <identifier> expected
    name = "DevloperNayan";  //direct initialization without constructor
        ^
1 error
*/