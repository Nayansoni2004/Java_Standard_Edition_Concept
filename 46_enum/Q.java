//concept: enum k andar constants kis tarah se bante h hum class k through samjhenge.
/*enum GlassSize {
    //enum class type constants static variables,not int/primitive type variables.
    SMAll, MEDIUM, LARGE
} */
class GlassSize {
    String value; //<-internal work by compiler...

    public static final GlassSize SMALL = new GlassSize("SMALL"); //<-internal work by compiler...
    public static final GlassSize MEDIUM = new GlassSize("MEDIUM"); //<-internal work by compiler...
    public static final GlassSize LARGE = new GlassSize("LARGE"); //<-internal work by compiler...
    
    private GlassSize(String value) { //<-internal work by compiler...
        this.value = value; 
    }

    public String toString() { //<-internal work by compiler...
        return value;
    } 
}
class Q {
    //main method
    public static void main(String[] args) {
        GlassSize gs = GlassSize.SMALL;
    }
}
/*OUTPUT:happily compiled...& runned but kuch print nhi hoga....
        (1)is example m humne samjha ki enum k andar compiler kya-kya internal working perform krta h,constants 
         variables ko store krne k liye.
D:\javaprac\46_enum>javac Q.java

D:\javaprac\46_enum>java Q
 */