class F {

    int e = 3;//variable declaration cum initialization

    void pro() {
        System.out.println("Jay ho");
    }
}

class D {

    //main method
    public static void main(String[] args) {

        D d = new D();

        System.out.println(d.e);

        d.pro();
    }
}
/* D.java:17: error: cannot find symbol
        System.out.println(d.e);
                            ^
  symbol:   variable e
  location: variable d of type D
D.java:19: error: cannot find symbol
        d.pro();
         ^
  symbol:   method pro()
  location: variable d of type D
2 errors

error aai kyuki D class ko bina child class banaye D class ka object banake F class k members ko access nhi kr
sakte.  */