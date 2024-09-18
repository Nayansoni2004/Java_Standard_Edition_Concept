class X9 {
    void pro() throws ArrayIndexOutOfBoundsException {
        System.out.println("Hello");
    }
}

class Y9 extends X9 {
    //always legal method over-riding: unchecked Exception
    void pro() throws ArithmeticException {
        System.out.println("Hello");
    }
}
/*OUTPUT: happily compiled...
NOTE: unchecked exception m NEWER ho, WIDER ho, NARROWER ho , FEWER ho sub chal jayega, everything legal h. 
 */