//Concept: Enhanced for loop ka use kr k ArrayList iterate krne pr type-safe declare krna padta h.
import java.util.ArrayList;
class X2 {
    //main method
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan"); //index-0 , internally auto-boxing hogi.
        x.add("ganesh"); //index-1 , internally auto-boxing hogi.
        x.add("vikram"); //index-2 , internally auto-boxing hogi.
        x.add("raj"); //index-3 , internally auto-boxing hogi.
        x.add("swaraj"); //index-4 , internally auto-boxing hogi.

        for(String y : x) {//kyuki hum ne type-safe declare kia h isley yaha Object ki jagah String link sakte h.
            System.out.println(y + " ##");
            System.out.println(y.length() + " :length");//String class m length() method h or String ki length return krti h.
        }
    }
}
/*OUTPUT:
mohan ##
5 :length
ganesh ##
6 :length
vikram ##
6 :length
raj ##
3 :length
swaraj ##
6 :length */