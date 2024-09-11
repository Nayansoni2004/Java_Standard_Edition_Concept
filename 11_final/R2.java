class R2 {

    //main method 
    public static void main(String[] args) {

        final String name;  //uninitialized variable

        name = "Nayan";
        name = "Aman";

        System.out.println(name);

    }
}
/* R2.java:9: error: variable name might already have been assigned
        name = "Aman";
        ^
1 error

java compiler ko dikkat Nayan ko leke nhi h, Aman ko leke h ,kyuki java bolta h kisi variable ko do value se 
initialization nhi kr sakte h.jo var. koi value se pahle hi assigned ho chuka h ,usko fir se koi value se initialize
nhi kr sakte, allowed nhi h.
*/ 