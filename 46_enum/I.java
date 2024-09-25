enum Days {
    //enum type constant variables,not int/primitive type.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class I {
    //main method
    public static void main(String[] args) {
        Days day;
        System.out.println(day);
    }
}
/*OUTPUT:method k andar k var. local variables kehlate h,or local variables ko agar hum explicit value se initialize
         na kre to wo default value se initialize nhi hote h.or hum us local var. ko print kr rhe h to error 
         aayega->variable day might not have been initialized.
D:\javaprac\46_enum>javac I.java
I.java:9: error: variable day might not have been initialized
        System.out.println(day);
                           ^
1 error
 */