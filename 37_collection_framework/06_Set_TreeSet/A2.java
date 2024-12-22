import java.util.TreeSet;
class A2 {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(" a");
        set.add("1j");
        set.add(" M");
        set.add("U2");
        set.add("5H");

        System.out.println(set);
    }
}
/*OUTPUT:kyuki space character ki ASCII value sub se kam 32 hoti h,isley pahle space wale print honge,fir 
         numeric print honge,fir last m U2 print hoga. 
[ M,  a, 1j, 5H, U2] */