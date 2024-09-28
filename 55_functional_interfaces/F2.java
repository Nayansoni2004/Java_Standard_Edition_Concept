@FunctionalInterface                                           
interface X6 {
    void pro();    
}

/*class Y2 implements X6 {
     public void pro() {
        System.out.println("Hello");
     }
} */

/* public void pro() {
    System.out.println("Hello");
 } 

() -> System.out.println("Hello");
 */

class F2 {
    //main method
    public static void main(String[] args) {
        //X6 x = new Y2();//<-polymorphic assignment...

        X6 x = () -> System.out.println("Hello JIIII");

        /*X6 y = new X6() {
            public void pro() {
                System.out.println("Hi");
            }
        }; */

        x.pro();
        //y.pro();

        System.out.println(x);//printing interface obj. ref. var...
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac F2.java

D:\javaprac\55_functional_interfaces>java F2
Hello JIIII
F2$$Lambda$1/0x00000178cf000bf8@4a574795 <-lambda expression interface ref. var. object ref. code...
 */