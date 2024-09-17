class E1 {
    //static method member
    static void info() {
        System.out.println(this);
    }
}
/* E1.java:4: error: non-static variable this cannot be referenced from a static context
        System.out.println(this);
                           ^
1 error 
error aai kyuki kisi bhi static block(method) k andar this "keyword" nhi likh sakte,kyuki this instance-level 
var. keyword h. */