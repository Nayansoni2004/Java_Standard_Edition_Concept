class O1 {

    final String name = "Drishti";//variable declaration cum initialization

    //main method 
    public static void main(String[] args) {

        O1 x = new O1();//object creation

        System.out.println(x.name);

        x.name = "Nayan";//modifying the value of final variable name.....

        System.out.println(x.name);//print the value after modification of var. name.......
    }
}
/* O1.java:12: error: cannot assign a value to final variable name
        x.name = "Nayan";//modifying the value of final variable name.....
         ^
1 error

*/