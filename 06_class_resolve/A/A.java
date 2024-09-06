//concept of how compiler interact with the class between many .java files.
class A {
    //main method...
    public static void main(String[] args) {
        
        B b = new B();

        System.out.println(b.v);
    }
}

class B {
    int v = 42;
}
//OUTPUT:42
//A.java file ki TWO dot class file banengi pahle compiler B class ko A.java k andar
//dhoondega agar B class exists nhi krti h to phir B.java k andar jake dhoondega.