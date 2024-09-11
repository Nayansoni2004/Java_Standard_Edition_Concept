class O2 {

    final char x = 'A';//variable declaration cum initialization

    //main method 
    public static void main(String[] args) {

        O2 y = new O2();//object creation.....

        System.out.println(y.x);//print the value of variable x....

        y.x = 'B';//modifying the value of variable x....

        System.out.println(y.x);//print the value of variable x after modification......
    }
}
/* O2.java:12: error: cannot assign a value to final variable x
        y.x = 'B';//modifying the value of variable x....
         ^
1 error
*/