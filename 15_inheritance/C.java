class X {
    void info() {
        System.out.println("info method");
    }
}

class C extends X {
    public static void main(String[] args) {
        C x = new C();

        x.pro();

        x.info();

        System.out.println(x.toString()); //returns the ref. code of obj. in hexadecimal form.
        
        System.out.println(x.hashCode()); //returns the ref.code of obj. in decimal form.
    }

    void pro() {
        System.out.println("pro method");
    }
}
/*
Demonstrated single inheritance by extending class X, accessing parent class methods, and utilizing Object class methods like toString() and hashCode().

D:\github_repos\javapractice\15_inheritance> java C
pro method
info method
C@7adf9f5f
2061475679
 */