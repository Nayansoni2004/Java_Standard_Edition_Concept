class D {
    //main method 
    public static void main(String[] args) {
        //array declaration cum instantiation
        int [] x = new int[4]; //arr. ko instantiate krte samay galti se bhi size dena nhi bhoolna h.

        System.out.println(x.length);
    }
}
/* OUTPUT: 4
array ka size humne 4 declare kia h isley entire arr. obj. ref. var. x k through array k length member ko call 
krne pr array ka length 4 print hua.
point: jaise hi array obj. banta h usme length integer type ka var. automatic ban jata h or wo length var. final
mark hota h kyuki arr. ki length(size) humne 1 bar declare kr dia to fir change nhi kr sakte.
*/