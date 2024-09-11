class Q {

    //main method 
    public static void main(String[] args) {

        int x;  //uninitialized variable
        
        int y = 8;   //initialized variable

        System.out.println(y);
        
    }
}
/* OUTPUT: 8   happily compiled and runed

main method k andar uninitialized variable declare kr sakte h,compile ho jayega but agar run krenge to run bhi
ho jayega,but kuch print nhi hoga,or phir error aa jayegi kyuki var. x ko koi value se initialization hi nhi kia
h,or print krne ki kosis kr rhe ho tum.To print nhi hoga.
*/