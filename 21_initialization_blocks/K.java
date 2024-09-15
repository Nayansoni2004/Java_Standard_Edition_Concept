class K {
    //static initialization block
    static {
        System.out.println(x);
    }
    //static var. member
    static int x = 9;
}
/* K.java:4: error: illegal forward reference
        System.out.println(x);
                           ^
1 error
error aai kyuki static initialization block class load hote hi classobject pr automatic run ho jate h,or static 
var. bhi class load hote hi classobject m unko memory allocate ho jati h,lekin kyuki execution line by line 
upar se niche ki ore hota h to static initialization block pahle run ho jayega,or static var. baad m hoga,to fir
static initialization block m us static var. ko call nhi kr skate,kyuki order matter krta h,static var. pahle
declare krna padega,then static initialization block m usko call kr payenge. */