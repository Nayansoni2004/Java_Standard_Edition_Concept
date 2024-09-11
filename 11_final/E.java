class V {

    int f = 6;//variable declaration cum initialization

    void pro() {
        System.out.println("sat shree kal");
    }
}

class E {
    void pro() {
        System.out.println("Namaskaram");
    }

    //main method
    public static void main(String[] args) {

        E e = new E();

        System.out.println(e.f);

        e.pro();
    }
}
/* E.java:20: error: cannot find symbol
        System.out.println(e.f);
                            ^
  symbol:   variable f
  location: variable e of type E
1 error

1 error aai kyuki E class ko bina child class banaye E class ka object banake V class k members ko access nhi kr 
sakte.   */