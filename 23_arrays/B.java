class B {
    //array declaration.
    static int[] x; //iske andar galti se bhi size nhi likhna h.

    //main method 
    public static void main(String[] args) {
        System.out.println(x);
    }
}
/* happily compiled...
OUTPUT: null

Entire array obj. ref. var. Bydefault "null" value se initialize hota h.isley array ref. var. x kisi bhi type ka
ho usko access krne pr null print hota h. kyuki entire array obj. ref. var. implicitely null value se initialize
hota h. */