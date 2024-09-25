enum GlassSize {
    //class enum type constants public static final variables.
    SMALL(200, 'S'), MEDIUM(300, 'M'), LARGE(500, 'L');

    int ml;
    char lb;//<-label.

    GlassSize(int ml, char lb) {
        this.ml = ml;
        this.lb = lb;
    }
}

class S {
    //main method
    public static void main(String[] args) {
        GlassSize[] gs = GlassSize.values();//enum k pass ye method internally hoti h ye understood h.

        //iterating array of type enum through Enhance-for loop.
        for(GlassSize g : gs)
            System.out.println(g + ":" + g.ml + " -> " + g.lb);
        
    }
}
/*OUTPUT:Size k saath labelling bhi kr di h.
D:\javaprac\46_enum>javac S.java

D:\javaprac\46_enum>java S
SMALL:200 -> S
MEDIUM:300 -> M
LARGE:500 -> L
 */