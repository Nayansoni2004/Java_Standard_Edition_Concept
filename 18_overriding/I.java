class A1 {
    final void pro() {
        System.out.println("Hi");
    }
}

class B1 extends A1 {
    
}

class I {
    public static void main(String[] args) {
        B1 x = new B1();

        x.pro();
    }
}
/*
happily compiled...
output : Hi

🔒 Why can’t final methods be overridden?
Java uses final to lock down a method — preventing any subclass from modifying its behavior. This is useful for:

[1]Ensuring security or consistency in logic.
[2]Preventing accidental overrides in large codebases.
 */