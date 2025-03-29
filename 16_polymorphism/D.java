class X2 extends X1 {

}

class X1 {

}

class D {
    public static void main(String[] args) {
        X1 x = new X2();

        X2 y = new X1();   // not okk
    }
}

/*
Encountered a type incompatibility error by attempting to assign a parent class (X1) object to a child class (X2) reference, which is invalid in Java.

D.java:13: error: incompatible types: X1 cannot be converted to X2
        X2 y = new X1();   // not okk
               ^
1 error
 */