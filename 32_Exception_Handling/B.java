class B {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        String x = null;

        System.out.println(x.length());

        System.out.println(3);
    }    
}
/* OUTPUT:
1
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at B.main(B.java:8)
*/