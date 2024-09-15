//RUNTIME POLYMORPHISM DYNAMIC METHOD DISPATCH OCCURS BECAUSE OF,METHOD OVER-RIDING
class X {
    //instance level overridden method member
    void pro() {
        System.out.println("Hi");
    }
}

class X1 extends X {
    //instance level overriding method
    void pro() {
        System.out.println("Hello");
    }
}

//apni test class
class C {
    //main method
    public static void main(String[] args) {

        X x = new X1();  //polymorphic assignment...

        x.pro(); //jub bhi var. ka use krke method ko call krte h to compiler var. ka type check krta h
    }
}    //OUTPUT: Hello   
/* x.pro m var. ka use kr k method ko call kia h ,or jub bhi variable ka use hota h to compiler var. ka type check
krta h,to var. parent class ka h to compile time kehta h,tumne child class ka object parent class var. m rakha
h,to child parent jese behave krne lagega,to parent ka method version run hoga,compiler code pass kr deta h,check 
kr k lekin runtime kehta h tumne child class k object ko parent class var. m rakha h,or agar child k pas khud ka
over-riding version h to me runtime child class k overriding version ko run krunga,due to DYNAMIC METHOD DISPATCH.

kon se class ka method version run hoga ye runtime pe decide krna DYNAMIC METHOD DISPATCH kehlata h,or runtime
decide krta h ki konse class ka method version run hoga.
NOTE: isa instance level k case m hi hota h,kyuki static method over-ride nhi hoti,overhide hoti h,kyuki static
method compile time pr resolve ho jati h,static methods are not a part of DYNAMIC METHOD DISPATCH.
*/