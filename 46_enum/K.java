enum Days {
    //enum type constants static variables,not int/primitive type variables.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class K {
    //main method
    public static void main(String[] args) {
        Days day = Days.FATHERSDAY;
        System.out.println(day);
    }
}
/*OUTPUT:kyuki FATHERSDAY constant variable enum Days m exists nhi krta h isley error aya!

D:\javaprac\46_enum>javac K.java
K.java:9: error: cannot find symbol
        Days day = Days.FATHERSDAY;
                       ^
  symbol:   variable FATHERSDAY
  location: class Days
1 error
 */