enum Days {
    //enum constant class type enum variables,not int/primitive type variable.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class J1 {
    //main method
    public static void main(String[] args) {
        Days day = Days.MONDAY;//enum type constant var. can be accessed through <classenumname>.<membername>
        System.out.println(day);
    }
}
/*OUTPUT: enum Days k andar enum type constants variable h jo ki static h,to <enumclassname>.<membername> likh
          kr access krna padega.or humne isi technique se kia h to access ho jayega.
D:\javaprac\46_enum>javac J1.java

D:\javaprac\46_enum>java J1
MONDAY
 */