enum Days {
    //enum type constant variables,not primitive/int type.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class H1 {
    static Days day;

    //main method
    public static void main(String[] args) {
        System.out.println(day);
    }
}
/*OUTPUT: class type var. day will be initialized by default value "null" bec. it is static.
D:\javaprac\46_enum>javac H1.java

D:\javaprac\46_enum>java H1
null
 */