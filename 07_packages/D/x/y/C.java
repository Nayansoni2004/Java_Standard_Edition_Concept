//package declaration.
package x.y;

class C {
    //main method.
    public static void main(String[] args) {
        B b = new B();

        b.pro();
    }

}
/*Happily compiled and runed also
B.java or C.java files same folder y k andar h isley B class ki method bina public kiye C class m access ho gyi
kyuki dono .java files same folder k andar rakhi h. jub me ne C.java ko compile kia to B.java v sath m compile ho gyi */
/*
D:\javaprac\7_packages\D>javac x/y/C.java

D:\javaprac\7_packages\D>java x/y/C
Hello Duniya waloon 
*/