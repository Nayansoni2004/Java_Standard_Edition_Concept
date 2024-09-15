class O {
    //main method
    public static void main(String[] args) {
        int y = 12/0;  // p/q & q does not equal to 0 rational no. rule
    }
}
/* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at O.main(O.java:4)
main method k andar variable declaration cum initialization possible h,but main method k andar agruments call
statement likhna jada suitble hota h,variables class level pr main method k bahar declare krna chahiye.
error compile time pr nhi aai kyuki code acc. to compiler gramatically,syntaxtically correct h,compilation pass
but runtime pr exception occur hua jo ki error hi h,or exception occur hua kyuki
12 cannot divide by 0,agar 0 ki jagah or koi number se 12 ko divide krte to exception nhi aata,exception bs
isley aaya kyuki kisi bhi no. ko 0 se divide nhi kr sakte,acc. to rational no. rule. */ 