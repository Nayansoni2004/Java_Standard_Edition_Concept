enum GlassSize {
    //class enum type constants public static final variables,not int/primitive type variables.
    SMALL, MEDIUM, LARGE 
}

class V {
    void pro(GlassSize gs) {//<-class enum type ref. var. (gs)
        System.out.println(gs);
    }

    //main method
    public static void main(String[] args) {
        V v = new V();
        v.pro(GlassSize.LARGE);
    }
}
/*OUTPUT: enum ko hum method k andar parameter body m as an argument pass kr sakte h.
D:\javaprac\46_enum>javac V.java

D:\javaprac\46_enum>java V
LARGE
 */