class R {
    //main method
    public static void main(String[] args) {
        long a = 8L;

        String x = a.toString();

        System.out.println(x);
    }    
}
/* OUTPUT:
R.java:6: error: long cannot be dereferenced
        String x = a.toString();
                    ^
1 error
primitive data types k upar hum toString method call nhi kr sakte,kyuki primitive data type value ko khud m hi 
store krte h,primitive data type ka object nhi hota,class type ka object hota h us object pr hi to toString 
method call kr sakte h.
*/