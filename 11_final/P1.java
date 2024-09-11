class P1 {

    //main method 
    public static void main(String[] args) {

        final int x;    //uninitialized variable
        
        final int y = 10;  //initialized variable

    }
}
/* OUTPUT: happily compiled and runed 
 
main method k andar final variable ko kewal declaration bhi kr sakte h,legal h kyuki jub tak main method k andar
us final variable ko use nhi krenge matlab (jub tak us final var. ko print nhi krenge)tab tak error nhi aaigi,
lekin agar final var. class m direct hota to error aati kyuki variable declaration cum initialization dono krna
padta h,,kewal declaration kia h main method k andar isley compile ho jayega or run bhi ho jayega but kuch print
ni hoga,kyuki print statement likha hi nhi h....

*/