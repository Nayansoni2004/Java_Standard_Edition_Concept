abstract class M {

    //method member 
    static abstract void info();//method declaration

}
/* M.java:4: error: illegal combination of modifiers: abstract and static
    static abstract void info();//method declaration
                         ^
1 error

method ko static or abstract keyword se ek sath mark nhi kr sakte,kyuki static mark kr dene se,class name class 
context create krta h or class context m static members ko direct access kr sakte h,lekin M class abstract mark
h,isley M class ka direct object nhi bna sakte,or jub abstract class ka object hi nhi bane ga to static abstract 
method ko direct kese access kr payenge,isley abstract class ki method ko static or abstract dono mark nhi kr 
sakte h.
*/