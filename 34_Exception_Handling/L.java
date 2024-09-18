class X8 {
    void pro() throws ArrayIndexOutOfBoundsException {
        System.out.println("Hello");
    }
}

class Y8 extends X8 {
    //always legal method over-riding: unchecked Exception
    void pro() throws IndexOutOfBoundsException {
        System.out.println("Hello");
    }
}
/*OUTPUT: happily compiled...Unchecked category k Exceptions m koi rule nhi h,overridden method version m child
Exceptions or overiding method version m parent Exeptions bhi likh sakte h,legal h but only for unchecked exceptions.
*/