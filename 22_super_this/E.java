class E {
    //static initialization block
    static {
        System.out.println(this);
    }
}
/* E.java:4: error: non-static variable this cannot be referenced from a static context
        System.out.println(this);
                           ^
1 error
error aai kyuki kisi bhi static block(method) k andar this "keyword" nhi likh sakte,kyuki this instance-level 
var. keyword h. */ 