enum Days {
    //enum type constant variables,not primitve/int type.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class J {
    //main method
    public static void main(String[] args) {
        Days day = MONDAY;
        System.out.println(day);
    }
}
/*OUTPUT:day class type enum ka var. h or usme hum enum k constant member ko hold kr rhe h,but error aayega,kyuki
         MONDAY enum type ka constant var. h usko <classenumname>.<membername> likh kr access krna padega.
D:\javaprac\46_enum>javac J.java
J.java:9: error: cannot find symbol
        Days day = MONDAY;
                   ^
  symbol:   variable MONDAY
  location: class J
1 error
 */