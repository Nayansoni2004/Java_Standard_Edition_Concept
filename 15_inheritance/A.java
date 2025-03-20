class A {
    public static void main(String[] args) {
        pqr();

        pro();

        mno();
    }

    static void pro() {
        System.out.println("pro");
    }
}

/*
D:\github_repos\javapractice\15_inheritance> javac A.java
A.java:3: error: cannot find symbol
        pqr();
        ^
  symbol:   method pqr()
  location: class A
A.java:7: error: cannot find symbol
        mno();
        ^
  symbol:   method mno()
  location: class A
2 errors
 */