enum Days {
    //enum type constant variables,not primitive/int type
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class H {
    Days day;//class(enum) type variable day.
    //main method
    public static void main(String... args) {
        System.out.println(day);
    }
}
/*OUTPUT:
D:\javaprac\46_enum>javac H.java
H.java:9: error: non-static variable day cannot be referenced from a static context
        System.out.println(day);
                           ^
1 error
 */