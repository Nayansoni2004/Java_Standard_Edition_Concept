class Y2 {
    
    //void pro() {
    //    System.out.println("pro in Y2");
    //}
}

class E extends Y2 {

    void pro() {
        System.out.println("pro in Y2");
    }
    //main method 
    public static void main(String[] args) {
        
        Y2 a = new E();  //polymorphic assignment

        a.pro(); //polymorphic method call/invocation
    }
}
/* E.java:18: error: cannot find symbol
        a.pro();
         ^
  symbol:   method pro()
  location: variable a of type Y2
1 error

error kyuki Y2 class m method commented h, or E m pro() khud ki method h,to overriding hi nhi hui,to compiler var.
ka type check krega ki var. parent type ka h,lekin parent m pro nam se koi method nhi h,isley compilation error 
aai.  */