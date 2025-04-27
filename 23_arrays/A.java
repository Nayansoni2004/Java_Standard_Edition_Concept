class A {
    //array declaration.
    int[] x; //iske andar galti se bhi size nhi likhna h...
    
    //main method
    public static void main(String[] args) {
        System.out.println(x);
    }
}
/* A.java:7: error: non-static variable x cannot be referenced from a static context
        System.out.println(x);
                           ^
1 error
array ref. var. instance-level h usko static context(main method)m direct access nhi kr sakte. 
*/