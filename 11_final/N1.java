class N1 {

    final static int x;//variable declaration 
    static final int y = 0101;//varaiable declaration cum initialization

}
/* N1.java:3: error: variable x not initialized in the default constructor
    final static int x;//variable declaration
                     ^
1 error

POINT 1:final keyword se marked variable ko declaration k sath initialization bhi krna padta h,ya phir 
        constructor k andar bhi koi value se initialize kr sakte h,but kewal declaration java allowed nhi krta h.

POINT 2:class k andar variable declaration or varialble declaration cum initialization dono ko static mark kr 
        sakte h,legal h.or variable declaration cum initialization m static final ya final static dono tarah se
        likh sakte h,order matter nhi krta, static k baad final ya final k baad static likh sakte h.
*/