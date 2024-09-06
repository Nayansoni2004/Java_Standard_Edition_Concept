class A {
    //main method...
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.h);
    }
}

/*A.java:4: error: cannot find symbol
        B b = new B();
        ^
  symbol:   class B
  location: class A
A.java:4: error: cannot find symbol
        B b = new B();
                  ^
  symbol:   class B
  location: class A
2 errors*/

//error aai kyuki compiler ko A.java file k andar B class mili hi nhi or B class ka object
//k name pr koi or .java file compiler ko mili nhi isley error aai.
//is karan A class ka compilation complete nhi hua or .class file v nhi bani.