class M {
    enum Days {
        //enum type static constant variables,not int/primitive type variables.
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
    }

    //main method
    public static void main(String[] arsg) {
        Days day = Days.TUESDAY;//<-yaha hum bina outer class ka obj. banaye inner class enum ko access kr rhe h.

        System.out.println(day);
    }
}
/*OUTPUT:hum outer class M m bina outer class ka obj. banaye inner class enum ko access kr rhe h ,to easily 
         access ho jayega,kyuki enum Regular-Inner class jesa behave nhi krta h,enum k case m thoda alag h
         concept.
D:\javaprac\46_enum>javac M.java

D:\javaprac\46_enum>java M
TUESDAY
 */