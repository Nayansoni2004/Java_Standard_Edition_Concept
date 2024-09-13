abstract class K3 {

    //method member...
    /*default*/abstract void def();

}
/* OUTPUT:  happily compiled

agar kisi abstract class ki abstract method pr koi bhi access modifier nhi lagaya h,to java implicitely us method
pr default access modifier laga deta h,jo ki legal h,Default matlab (package-level-access-control) jo ki same 
packages m instantiation k through bhi or inheritance k through bhi accessible hota h,but different packages m
na hi instantiation k through or na hi inheritance k through accessible hota h,isley abstract method pr koi bhi
access modifier explicitely nhi lagaya h, to java implicitely abstract method ko Default mark kr deta h.

*/