class H {
    public static void main(String[] args) {
        int[] x = new int[2]; //size: 2

        System.out.println(x[-1]); //index: -1
    }
}
/* code compilation passed, Exception at runtime because array size cannot be negative, even if array size is
positive & valid then accessing element at negative index which does not exists, give execption 
ArrayIndexOutOfBoundsException.

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
        at H.main(H.java:5)
*/