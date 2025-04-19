class C3 {
    private void pro() {
        System.out.println("Hi");
    }
}

class D3 extends C3 {
    void pro() {
        System.out.println("Hello");
    }
}

class J2 {
    public static void main(String[] args) {
        D3 x = new D3();
        x.pro();
    }
}
/*OUTPUT: Hello
 * since parent has private method, that can't be called from or inherited in subclass, so the method present in 
 * subclass D3 is its own method, & inside class J the object is of child class with the child class ref. var.
 * so method present in D3 will be called & will be executed.
 */