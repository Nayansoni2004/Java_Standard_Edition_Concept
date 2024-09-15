// NOT A DYNAMIC METHOD DISPATCH BEC. THERE IS VAR. NOT A METHOD...
class X {
    //var. member
    static int a = 2;
}

class X1 extends X {
    //var.member
    static int a = 8;
}

//apni test class.
class B {
    //main method
    public static void main(String[] args) {

        X x = new X1();  //polymorphic assignment

        System.out.println(x.a);
                        // X.a <-compiler hamare behalf m likh dega ye.
    }
}
/* OUTPUT: 2
X super class ka var. print hoga kyuki compiler hamare behalf m x.a ki jagah class ka name likh dega X.a or 
hamesha var. ka type dekha jata h ki var. kis type ka h or var. parent type ka h,to child class ka object parent
jese behave krne lagega, to X super class ka var. print hoga.
*/
