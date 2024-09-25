enum GlassSize {
    //class enum type constants static variables,not int/primitive type variables.
    SMALL(200), MEDIUM(300), LARGE(500);

    int ml;

    GlassSize(int ml) {
        this.ml = ml;
    }
}

class R {
    //main method
    public static void main(String[] args) {
        GlassSize gs = GlassSize.MEDIUM;

        System.out.println(gs.ml);
    }
}
/*OUTPUT:internally 3 GlassSize obj. enum ne banaya hoga usme non-static var. ml ko memory allocate hui hogi,
         or constructor ne un teeno objects ko initialize kia hoga,SMALL var. ml ko 200 se MEDIUM var. ml ko
         300 se or LARGE var. ml ko 500 se,or hum enum type ke ref. var. se Q class m enum k constant var.
         ko <enumname>.<membername> likh kr access kr rhe h to un ml variables m rakhi values print hongi,na
         ki objects k ref. code kyuki enum GlassSize ne internally toString()method ko call kia hoga.
D:\javaprac\46_enum>javac R.java

D:\javaprac\46_enum>java R
300 
 */