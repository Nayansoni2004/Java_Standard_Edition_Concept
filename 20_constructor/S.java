class S {
    //programmer supplied constructor...
    S() {
        super(12);
    }
}
/* S.java:4: error: constructor Object in class Object cannot be applied to given types;
        super(12);
        ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error

super(); no argument call hota h,usme koi argument nhi de sakte,kyuki humne super(12); argument pass kia h or 
kyuki super parent ko call krta h or parent class Object m object()constructor k pass koi variable nhi h,isley 
super call m koi argument pass nhi kr sakte.
*/