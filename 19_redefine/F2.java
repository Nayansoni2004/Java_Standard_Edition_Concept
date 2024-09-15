class X {
    //instance level var. member
    int a = 10;
}

interface Y {
    //bydefault static var. member
    int a = 12;
}

class F2 extends X implements Y {
    //main method 
    public static void main(String[] args) {

        Y f = new F2();  //interface ka object nhi bana sakte,lekin var. bana sakte h.

        System.out.println(f.a);
    }
}
/* D:\javaprac\19_redefine>java F2
12
ambiguity situation occur nhi hui kyuki interface ka var. bana k child class ka ref. code us var. m hold kr dia
or jub us var. f k through a member var. ko call krenge to interface ka memeber call hoga,kyuki define kr dia ki
interface k var. ko call kr rhe h...
*/