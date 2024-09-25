enum Days {
    //class enum type constant static variables,not a int/primitive type variables.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
}

class O {
    //main method
    public static void main(String[] args) {
        Days day = new Days();//<-hum enum ko instantiate nhi kr sakte.

        System.out.println(day);
    }
}
/*OUTPUT:hum enum ka object nhi bana sakte,mtlb enum ko instantiate nhi kr sakte,kyuki enum ka object automatically
         java bana k deta h.
D:\javaprac\46_enum>javac O.java
O.java:9: error: enum types may not be instantiated
        Days day = new Days();//<-hum enum ko instantiate nhi kr sakte.
                   ^
1 error
 */