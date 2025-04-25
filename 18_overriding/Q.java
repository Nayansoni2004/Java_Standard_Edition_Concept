class DD {
    static void pro() {
        System.out.println("Hi");
    }
}

class EE extends DD {
    static void pro() {
        System.out.println("Hello");
    }
}

class Q {
    public static void main(String[] args) {
        // DD x = new DD();
        // EE x = new EE();

        DD x = new EE();

        x.pro();
    }
}
/*OUTPUT:
PS D:\github_repos\javapractice\18_overriding> java Q
Hi

Static methods are resolved at compile-time, not at runtime.
Even though x is referencing a new EE() object, its reference type is DD, so the compiler binds pro() from DD.

This is not method overriding but method hiding (overhiding) because pro() is static in both classes.
 */