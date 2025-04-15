//method overloading example.
class X2 {
    //method member...
    void pro() {

    }

}

class B extends X2 {
    //legal method overloading...
    void pro(int x) {

    }

}
/* happily compiled and runned.....
B class kehta h mere pas two versions h,method k jo overload ho rhe h,matlab B class k pas two overloaded versions
h. 1 parent class se inherit ho rha h or 1 child class ka khud ka method h,sub-class k pas. */

/*
This is method overloading:
🔸 Same method name, but different parameters (type/count/sequence).
🔸 Both methods coexist — one from parent, one from child.
Result: Class B has two versions of pro().
 */