enum GlassSize {
    //class enum type constants public static final variables
    SMALL(200, 'S'), MEDIUM(300, 'M'), LARGE(500, 'L');

    int ml;
    char lb;//<-label.

    GlassSize(int ml , char lb) {
        this.ml = ml;
        this.lb = lb;
    }

    public String toString() {
        return this.ml + " ->> " + this.lb;
    } 
}

class S1 {
    //main method
    public static void main(String[] args) {
        GlassSize[] gs = GlassSize.values();//enum k pass ye method internally hoti h ye understood h.

        //iterating array of type enum through enhanced-for loop.
        for(GlassSize g : gs) {
            System.out.println(g);
        }
    }
}
/*OUTPUT:enum GlassSize m toString()<-method ko over-ride kia h,isley ml or label(lb)bhi print hua.
D:\javaprac\46_enum>javac S1.java

D:\javaprac\46_enum>java S1
200 ->> S
300 ->> M
500 ->> L
 */