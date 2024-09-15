class J3 {
    //instance-level var. member
    int x = 90;
    //instance-level INITIALIZATION BLOCK
    {
        System.out.println(x);
    }
}
/* happily compiled....kyuki instance var. ko initialization block m access/call krne se pahle declare kia h,
to accessible hoga,lekin agar instance var. ko initialization block k baad declare krte or initialization block
m access/call krte to error:illegal forward reference atti,kyuki order matter krta h,or var. ko pahle hi declare 
krna padega tabhi initialization block m us var. ko call ya access kr payenge. */