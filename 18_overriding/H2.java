class Z2 {
    static void pro() {

    }
}

class H2 extends Z2 {
    static void pro() {

    }
}
/* happily compiled 

there is no dynamic method dispatch in this code, but its a method overriding,but java developers including me 
dont think its a method overriding bec. static methods do not get override doesnt matter they have a same signature
in parent as well as in child, bec. when subclass redefines a parent method in child class and its static, then its 
not a overriding, then it is called overhiding,bec. static methods are resolved at compile time & they are not a part
of dynamic method dispatch.

[This code compiles happily.
Although the method signatures match, it's not method overriding because both methods are static.
In Java, static methods are not overridden, they are hidden.
This is known as method hiding, and it’s resolved at compile time, not runtime.
Therefore, no dynamic method dispatch takes place here]
*/