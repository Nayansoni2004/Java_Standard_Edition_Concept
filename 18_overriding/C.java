class X3 {
    //over-ridden method member...
    void pro() {

    }
}

class C extends X3 {
//legal method OVER-RIDING...
    //overriding method.
    void pro() {

    }
}
/* parent class ka method overridden method kehlata h,kyuki child us ko redefine krta h,or child class m wo method
redefine kia jata h,isley overriding method kehlata h.
OUTPUT:    happily compiled....
rule 1: parameter body must match in both the overridden method and the overriding method version.
rule 2: return type of overridden method and the overriding method must match.

X3 parent class ka method ,C child class ne redefine kia,isley method overriding hui.or legal h.
*/