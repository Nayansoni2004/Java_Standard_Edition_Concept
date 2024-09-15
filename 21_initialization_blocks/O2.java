class O2 {
    //static initialization block
    static {
        //instance level var. member
        int y = 12/0;        
    }
    //main method
    public static void main(String[] args) {
       
    }
}
/* Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
        at O2.<clinit>(O2.java:5)
compiler ne code gramatically,syntaxtically check kr k compiler pass kr diya or code successfully compile ho gya,\
but runtime pr class load nhi ho payega kyuki static initialization block class ko load hone m madat krta h,but
usme problem h that is kisi bhi no. ko zero se divide nhi kr sakte acc. to rational no. rule p/q & q must not 
equal to zero,but q equal to 0 ho gya isley runtime exception occur hua...arithmeticException: divide by zero */