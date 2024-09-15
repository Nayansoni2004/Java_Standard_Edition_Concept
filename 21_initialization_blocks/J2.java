class J2 {
    //instance-level INITIALIZATION BLOCK
    {
        System.out.println(x);
    }
    //instance-level var. member
    int x = 90;
}
/* J2.java:4: error: illegal forward reference
        System.out.println(x);
                           ^
1 error
error aai kyuki agar instance-level var. ko instance-INITIALIZATION BLOCK k andar access kr rhe h ya call kr rhe 
h to var. declaration initialization block k pahle krna padta h,order matter krta h. */