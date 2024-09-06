class A {
    //main method
    public static void main(String[] args) {
        
        B b = new B();

        b.a1();
    }
}

/*D:\javaprac\6_class_resolve\G>javac A.java

D:\javaprac\6_class_resolve\G>java A
THE CHAIN EFFECT:
*/
/* A.java ko compile krne pr usne B.class file banai or sath hi C.java ko compile kia
or C.class banai or sath hi D.java ki v D.class banai or A.java ko run krne pr saari 
Files acces ho gyi to result chain effect aaya.