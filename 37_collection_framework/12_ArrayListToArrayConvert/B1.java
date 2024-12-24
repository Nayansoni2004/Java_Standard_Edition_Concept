import java.util.ArrayList;
class B1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = new Integer[0];//kyuki hume size 0 declare kia h or ArrayList k na hi equal na or na bada,isley new array banega.
        Integer[] arr = x.toArray(ar);/*<-paramater m type-safe arrayList do to type-safe array return krta h,or
         ye avi type-safe Integer array return kr rha h,to Integer matlab same class m assign kr sakte h,legal h.*/
        
        //Iterating array of type Integer through Enhanced for loop.
        for(Integer obj : arr) {
            System.out.println(obj);
        }
        System.out.println(ar == arr);/*kyuki new array ban jayega,or ref. code alag hoga dono array obj. ka 
                                        isley false aayega,just test kia humne ki new array ban rha h ya old
                                        m hi toArray()<-call ho rh h,to new ban rha h.*/
    }
}
/*OUTPUT: kyuki ArrayList type-safe declare kia h,to toArray()method type-safe ArrayList ko type-safe Integer 
          Array m convert kr k de rha h,or hum same Integer ko Integer m assign kr sakte h,legal h.
12
13
15
21
9
false<-kyuki dono,array obj. k ref. code alag alag h. */