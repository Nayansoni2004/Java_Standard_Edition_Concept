class C1 {
    private void pro() {
        System.out.println("HI");
    }
}

class D1 extends C1 {

}

class J {
    public static void main(String[] args) {
        D1 x = new D1();

        x.pro();
    }    
}
/* compilation failed...
 * J.java:15: error: cannot find symbol
        x.pro();
         ^
  symbol:   method pro()
  location: variable x of type D1
1 error
 */
/*
📌 Key Concept:
Private methods are not inherited and hence not eligible for overriding. This is why x.pro(); fails even though C1 has a method named pro().
 */
