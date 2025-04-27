class E {
    //main method
    public static void main(String[] args) {
        //array declaration cum instantiation
        int[] x = new int[4]; //array ko instantiate krte samay galti se bhi size dena nhi bhoolna h.

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
    }
}
/* OUTPUT: 
0
0
0
0
entire arr. obj. ref. var. x k through array k index element ko access kr rhe h to kyuki humne koi explicit value
assign nhi ki h isley implicitely saare index pr 0(zero)value bydefault assign ho jayegi. */