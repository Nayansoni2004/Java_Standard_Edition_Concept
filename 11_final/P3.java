class P3 {

    //main method 
    public static void main(String[] args) {

        final int x;    //uninitialized variable
        x=0;
        System.out.println(x);

        final int y = 10;  //initialized variable

    }
}
/* OUTPUT: 0                       happily compiled and runed

main method k andar final var. ko kewal declaration kr sakte h,lekin print krne se pahle initialization krna
padega,nhi to error aaigi,,ab final var. ko main method k andar direct(next line m) initialization kr sakte h,
constructor k andar nhi kr sakte,kyuki main method k andar constructor nhi hota h,constructor to class m direct 
banate h,or initialize krne k baad print bhi ho jayega.
*/