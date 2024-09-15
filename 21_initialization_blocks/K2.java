class K2 {
    //static initialization block
    static {
        System.out.println();
    }
    //static var. member
    static int x = 9;
}
/* happily compiled...agar static var. ko static initialization block m call nhi kr rhe h,to order matter nhi 
krta,ki variable initialization block k pahle declare h ya baad m declare h,lekin agar static var. ko initialization
block m access krte to fir order matter krta,pahle static var. declare hi krna padta then,initialization block
banana padta. */ 