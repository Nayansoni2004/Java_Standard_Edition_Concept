class X {
    //variable member...
    int a = 10;
}

class X1 extends X {
    //variable member...
    int a = 11;
}

//apni test class.
class A {
    //main method...
    public static void main(String[] args) {

        X x = new X1();  //polymorphic assignment...

        System.out.println(x.a);
    }
}
/* OUTPUT:   10
ye DYNAMIC METHOD DISPATCH NHI H, kyuki is me method nhi var. bana h, or X super class ka var. isley print hoga,
kyuki compiler var. ka type dekhega ki var. parent class type ka h, object to child class ka h, to var. ko call 
krne pr child class parent jese behave krne lagega. or hamesha var. ka type hi declare krta h ki konsa method ya
var. run hoga! or var. class X type ka h isley X class ka var. print hoga.
*/ 