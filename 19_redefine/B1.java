//is me DYNAMIC METHOD DISPATCH NHI H kyuki class m var. bana h method nhi.
class A {
    //var. member 
    static int x = 12;
}

class B1 extends A {
    //var. member
    static int x = 14;
}

class Test {
    //main method
    public static void main(String[] args) {

        A a = new B1();  //polymorphic assignment.

        System.out.println(a.x);
                         //A.x <-ye,compiler hamare behalf m likh dega.
    }
}
/* OUTPUT:   12
compiler hamare behalf m a.x ki jagah class ka type A.x likh dega,or kyuki var. super class type ka h,isley B1
child class parent A jese behave krne lagega or A class ka var. print hoga,kyuki hamesha var. ka type hi decide
krta h ki konsa method ya var. print hoga.
*/