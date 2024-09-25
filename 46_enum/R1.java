enum GlassSize {
    //class enum type constants variables.
    SMALL(200), MEDIUM(300), LARGE(500);

    int ml;
    
    GlassSize(int ml) {
        this.ml = ml;
    }
}

class R1 {
    //main method
    public static void main(String[] args) {
        GlassSize[] gs = GlassSize.values();

        //Enhanced-for loop ka use kr k enum k constants variables. ko array m se print kia h.
        for(GlassSize g : gs) 
            System.out.println(g + ":" + g.ml);
        
    }
}
/*OUTPUT:enum type ka array banaya h or us array m se constants values ko enhanced-for loop k through access/
         print kia h.
D:\javaprac\46_enum>javac R1.java

D:\javaprac\46_enum>java R1
SMALL:200
MEDIUM:300
LARGE:500
 */