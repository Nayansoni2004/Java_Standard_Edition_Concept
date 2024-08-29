class J1 {
    int x;

    void pro() {
        y = 100;
    }

    J1() {
        y = 70;
    }
}

//D:\javaprac\1_source_code_organization>javac J1.java
//J1.java:5: error: cannot find symbol
//       y = 100;
//        ^
//  symbol:   variable y
//  location: class J1
//J1.java:9: error: cannot find symbol
//        y = 70;
//        ^
//  symbol:   variable y
//  location: class J1
//2 errors