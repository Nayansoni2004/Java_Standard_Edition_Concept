/*concept of this code: private member of a class whether its a variable or a method can only be accessed inside
the class ,and can't be accessed outside the class.*/

//package declaration.
package a;

public class A {

    private int d = 8888;

    private void pro() {
        System.out.println(d);
    }
//main method.
    public static void main(String[] args) {

        A a = new A();

        a.pro();
    }
}
/*
kisi class ka private member kewal us class k andar accessible hota h.
or koi class m usko access nhi kr sakte na hi same package location m na hi different package
location m , na hi instantiation k through na hi inheritance k through.

OUTPUT:8888
*/