class P2 {

    //main method 
    public static void main(String[] args) {

        final int x;    //uninitialized variable
        
        System.out.println(x);

        final int y = 10;  //initialized variable

    }
}
/* P2.java:8: error: variable x might not have been initialized
        System.out.println(x);
                           ^
1 error

main method k andar final variable ko kewal declaration kr sakte h,lekin bina koi value se initialization kre 
us final variable x ko print nhi kr sakte,kyuki jub kuch value se wo final var. x initialize hi nhi hoga to kuch
print bhi nhi hoga,,lekin agara wahi var. class m direct bana hota to usko wahi pr declaration cum initialization
dono krna padta,kyuki wo main method k andar h isley kewal declaration bhi allowed h....but bina initialize kre
print nhi kr sakte h.... 
*/