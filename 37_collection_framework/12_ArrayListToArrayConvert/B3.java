import java.util.ArrayList;
class B3 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = new Integer[x.size()];//ArrayList ki size ka hi array of Integer obj. banega or length property m 5 set ho jayega.
        Integer[] arr = x.toArray(ar);//ar jisko obj. ko point kr rha h us object k array length 5 h to usi m ArrayList convert hoke array ban jayega.
        //Iterating array of Integer through Enhanced for-loop.
        for(Integer obj : ar) {
            System.out.println(obj);
        }
        //test:test kr rhe h ki new array banega ya usi ArrayList ko array m convert kr dega JVM.
        System.out.println(ar == arr);//array obj. k ref. code m comparison hoga.
    }
}
/*OUTPUT:
12
13
15
21
9
true<-true aaya kyuki new array nhi bana kyuki hum ne array of Integer obj. ka size ArrayList obj. k size k 
      equal kr dia tha,agar array ka length property ArrayList k size() se jada ya equal hota h to new array nhi
      banta,lekin agar array ka length ArrayList k size se kam rehta h to internally new array ban jata h,kyuki
      new array nhi bana to 1 hi object h or usi ka ref. code usi se comparison kr rhe h to true aaya.*/