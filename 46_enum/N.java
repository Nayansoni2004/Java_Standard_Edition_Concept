class N {

    void process() {
        enum Days {
            //class enum type constants static variables,not int/primitive type variables.
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
        }
    }

}
/*OUTPUT:acc. to java version 11 hum enum ko method k andar nhi bana sakte,but java version 17 k anusar hum
         enum ko method k andar bana sakte h,or method k andar ka enum->Method local enum Inner class kehlata h.

D:\javaprac\46_enum>javac N.java <-happily compiled.
 */