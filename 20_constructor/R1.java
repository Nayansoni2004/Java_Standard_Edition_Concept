class R1 {
    //programmer supplied constructor...
    static R1() {
        
    }
}
/* R1.java:3: error: modifier static not allowed here
    static R1() {
           ^
1 error
constructor ko static mark nhi kr sakte, kyuki jub object banata h to constructor call hota h jo ki object ko
ban ne m help krta h,matlab constructor object ko initialize krta h,to constructor class k instance se belong krta
h,ClassObject se nhi,agar static mark kr denge to jub class load hogi or classObject banega or constructor bhi 
load ho jayega kyuki static member h,jo baad m object ko initialize nhi kr payega to object nhi ban payega,isley
constructor ko static mark nhi kr sakte.
*/