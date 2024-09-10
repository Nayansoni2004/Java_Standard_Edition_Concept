class A {

    //main method
    public static void main(String[] args) {

        B x = new B();

        x.pro();

        C y = new C();

        y.info();
    }
}
/* A.java:10: error: cannot find symbol
        C y = new C();
        ^
  symbol:   class C
  location: class A
A.java:10: error: cannot find symbol
        C y = new C();
                  ^
  symbol:   class C
  location: class A
2 errors

conclusion:- A class m B class or C class ko access kr rhe h but C class X.java m h,isley java pechan nhi payega,
or C class k object variable ko A class m dhundega,isley source file.java ka nam class k nam se exactly match hona
chahiye.  */