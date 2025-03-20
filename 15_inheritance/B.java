class B {
    public static void main(String[] args) {
        B x = new B();

        x.pro();

        System.out.println(x.toString()); //returns the ref. code of obj. in hexadecimal form.

        System.out.println(x.hashCode()); //returns the ref.code of obj. in decimal form.
    }

    void pro() {
        System.out.println("pro");
    }
}
/*
OUTPUT:
pro
B@3a71f4dd
980546781
 */