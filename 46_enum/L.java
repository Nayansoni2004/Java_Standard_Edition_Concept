enum Days {
    //enum type constant static variables,not int/primitive type variables
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class L {
    //main method
    public static void main(String[] args) {
        Days[] days = Days.values();//<-enum k pas ik method hoti h values()<-ye understood h.
        
        //iterating array of enum(Days)through Enhanced-forloop.
        for(Days day : days) {
            System.out.println(day);
        }
    }

}
/*OUTPUT:is example m humne ye bataya h ki hum enum ka array bhi bana sakte h,or enum k constants static variables
         ko iterate kr k print bhi kr sakte h.
D:\javaprac\46_enum>javac L.java

D:\javaprac\46_enum>java L
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
 */