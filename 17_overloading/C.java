class C {

    //methods...
    void pro(int x, float y) {

    }

    void pro(int a, float b) {

    }
}
/* C.java:8: error: method pro(int,float) is already defined in class C
    void pro(int a, float b) {
         ^
1 error

C class m methods mis-match nhi kr rhi h,dono same method h kyuki variable ka name kuch bhi
rakh sakte h,var. k name se koi farq nhi padta,parameter ka type,count,sequence mis-match
hona chahiye,tabhi method overloading kahliegi.
or C class m dono method k parameter match kr rhe h,isley error aai or ye legal method overloading
nhi h,illegal h.
*/