//Access ka concept:class A class B se kaise communicate krti h!!!
class A {
    static X e = new X();

    X w = new X();

    //main method...
    public static void main(String[] args) {
        X q;

        q = new X();
    }

    void info(X w) {

    }

    A() {
        X s = new X();
        info(s);
    }

    void pro() {
        X t = new X();
    }
}

class X {

}
//happily compiled...
//D:\javaprac\5_accesss>javac A.java

//D:\javaprac\5_accesss>java A

//D:\javaprac\5_accesss>
