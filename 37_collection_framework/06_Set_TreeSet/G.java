class G {
    //main method
    public static void main(String[] args) {
        String x = new String("ganesh");
        String y = new String("ramesh");
        String z = new String("ramesh");

        System.out.println(y.compareTo(x));//Output: +ve value
        System.out.println(x.compareTo(y));//Output: -ve value
        System.out.println(z.compareTo(y));//Output: 0(zero bec. alphabet ka sequence same h).
    }
}
/*OUTPUT:
11 <-(11 aaya bec. g To r diff. 11 alphabets ka h).
-11 <-(-11 aaya bec. g To r diff. 11 alphabets ka h or kyuki chote se bada compare kr rhe h isley - m aaya).
0 <-(zero aaya bec. 1 bhi alphabet ka sequence mis-match nhi hua) */