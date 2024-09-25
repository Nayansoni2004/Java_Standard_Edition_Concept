enum GlassSize {
    //class enum type constants variables,not int/primitive type variables.
    SMALL, MEDIUM, LARGE 
}

public class W {
    //main method
    public static void main(String[] args) {
        System.out.println(GlassSize.SMALL instanceof Object);
    }
}
/*OUTPUT:enum ka bhi ultimate parent Object hota h. isley true output aayega.
D:\javaprac\46_enum>javac W.java

D:\javaprac\46_enum>java W
true
 */