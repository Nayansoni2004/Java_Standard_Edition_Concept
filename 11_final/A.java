class X {

    int e = 88;//variable declaration cum initialization

    void pro() {
        System.out.println("Hello");
    }
}

class A {

    //main method 
    public static void main(String[] args) {

        X x = new X();//object creation

        System.out.println(x.e);//print krne k liye ye line likhte h

        x.pro();//method call
    }
}
/* OUTPUT: 88
           Hello    CONCLUSION:-
X class k andar direct variable or method bani h,or class name class context create krta h,or X class m instance
level matlab(non-static)members h,or instance level members ko class context m direct access nhi kr sakte,
or A class m static method h,matlab container main method decide krega ki ,X class ka object banake X class k
members ko A class m access kr sakte h.  */