class J4 {
    //instance-level initialization block
    {
        System.out.println();
    }
    //instance-level variable
    int x = 90;
}
/* happily compiled...NOTE: agar instance variable ko initialization block m call ya access nhi kr rhe h,to order
matter nhi krta ki initialization block pahle bana h ya instance-level var. pahle bana h,lekin agar access/call
krte to var. pahle declare krna padta,tabhi usko initialization block m call kr pate. */