class B1 {
    //programmer supplied(NO-PARAMETERIZED)constructor
    B1() {
        System.out.println(x);
    }
    //main method
    public static void main(String[] args) {
        B1 x = new B1();

        System.out.println(x);
    }
}
/* B1.java:4: error: cannot find symbol
        System.out.println(x);
                           ^
  symbol:   variable x
  location: class B1
1 error
error aai kyuki constructor k andar hum obj. ref. var. ko print statement m as a argument pass nhi kr sakte.kyuki 
wo var. obj. ka ref. code hold krta h,or constructor k andar us var. ko pass krenge to constructor ko lagega ki 
classlevel koi var. h,isley constructor obj. ka ref. code print nhi kr sakte,kyuki constructor ka kam object ko 
initialize krna hota h. */
