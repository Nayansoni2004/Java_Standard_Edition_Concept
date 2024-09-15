class X {
    //instance level var. memeber
    int a = 8;
}

interface Y {
    //bydefault static var. member
    int a = 10;
}

class F1 extends X implements Y {
    //main method 
    public static void main(String[] args) {

        X f = new X();  //X m instance member h,isley child m instance bana k access krna pada!

        System.out.println(f.a); 
    }
}
/* D:\javaprac\19_redefine>java F1
8
parent class ka var. memeber access hua kyuki,child ne define kr dia object bana k ki parent k member ko call kr 
rha h child...isley ambiguity situation occur nhi hui!!!
*/