enum GlassSize {
    //class enum type constants variables,not int/primitive type variables.
    SMALL(200, 'S'), MEDIUM(300, 'M'), LARGE(500, 'L') {
        public void pro() {
            System.out.println("Hello");
        }
    };

    void pro() {
        System.out.println("Hi");
    }

    int ml;
    char lb;//<-label.

    GlassSize(int ml, char lb) {
        this.ml = ml;
        this.lb = lb;//<-label.
    }

    public String toString() {
        return this.ml + " ->> " + this.lb;//<-label.
    }
}

class Z {
    //main method
    public static void main(String[] args) {
        GlassSize.SMALL.pro();
        GlassSize.MEDIUM.pro();
        GlassSize.LARGE.pro();
    }
}
/*OUTPUT:hum enum GlassSize means <classname>.<membername>likh k uske static variables SMALL, MEDIUM, LARGE
         variables k through pro()method ko call kr rhe h,to kyuki SMALL or MEDIUM k pass kuch ka pro()method 
         nhi h to GlassSize ka pro()method run hoga or Hi<-do bar print hoga,lekin LARGE k pas khud ka pro()method
         h to LARGE var. k through pro()call krne pr khud ka Hello version pro()run hoga.
         
D:\javaprac\46_enum>javac Z.java

D:\javaprac\46_enum>java Z
Hi
Hi
Hello
 */