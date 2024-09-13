abstract class X8 {

    //method declaration
    abstract void mno();

}

class H3 extends X8 {

    void mno() {
        System.out.println("mno method is now well-defined!!!");
    }
    
    //main method 
    public static void main(String[] args) {

        H3 h = new H3();

        h.mno();
    }

}
/* OUTPUT:  mno method is now well-defined!!!

abstract class ka object nhi bana sakte ,but inheritance k through access kr sakte h,or inheritance k through 
access krne pr ya to sub-class ko abstract mark krna padega ya phir abstract class ki method ko sub-class m 
definition provide kr k complete krna padega....or kyuki container (main method) decide krega ki static context
m instance level (non-static)members ko direct access nhi kr sakte,illegal h,isley H3 class ka variable or object
banake access krna padega.
*/