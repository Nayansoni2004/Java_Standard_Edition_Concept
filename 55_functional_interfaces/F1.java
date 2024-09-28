@FunctionalInterface
interface X5 {
    void pro(); 
}

class Y1 implements X5 {
    public void pro() {
        System.out.println("Hello");
    }
}

class F1 {
    //main method
    public static void main(String[] args) {
        X5 x = new Y1();//polymorphic assignment...

        x.pro();
    }    
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac F1.java

D:\javaprac\55_functional_interfaces>java F1
Hello
 */