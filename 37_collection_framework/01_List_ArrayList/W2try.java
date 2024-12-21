class W2try {
    static int x = 21;
    static int y = 21;
    public static void main(String[] args) {
       // System.out.println(x == y); OUTPUT: true. primitive type value h direct compare hogi value hi.

        System.out.println(x.equals(y)); //equals(Object obj)method primitive type value pe call nhi kr sakte.
        //error kyuki do primitive type value h or equals(Object obj)method Object parameterized h.
    }
}
/*OUTPUT:
W2try.java:7: error: int cannot be dereferenced
        System.out.println(x.equals(y));
                            ^
1 error
 */