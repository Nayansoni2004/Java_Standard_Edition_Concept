import java.util.ArrayList;
class R {
    //main method
    public static void main(String[] args) {
        ArrayList<String>  x = new ArrayList<String>();

        x.add("mohan"); //index-0
        x.add("sohan"); //index-1
        x.add("rohan"); //index-2
        x.add("gohan"); //index-3 
        x.add("tohan"); //index-4

        x.get(3).length(); //Also check N & N1.java...
    }
}
/*OUTPUT: happily compiled & runned. kyuki type-casting exempted h,compiler type-casting kr deta h,isley bhale
          hi length method Object alpha class m nhi,lekin fir bhi error: cannot find symbol,nhi aaya kyuki 
          hum ne type-safe declare kia h,isley compiler type-casting kr dega. */