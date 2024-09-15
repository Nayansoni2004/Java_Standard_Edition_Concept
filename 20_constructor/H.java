class X1 {
    //programmer supplied constructor
    X1() {
        System.out.println("Y");
    }
}

class X2 extends X1 {
    //programmer supplied constructor
    X2() {
        System.out.println("A");
    }
}

class X3 extends X2 {
    //programmer supplied constructor
    X3() {
        System.out.println("W");
    }
}

//test class
class H {
    //main method
    public static void main(String[] args) {
        System.out.println("T");

        X3 a = new X3();

        System.out.println("D");
    }
}
/*OUTPUT: T
          Y
          A
          W
          D                 PROCESS:how code execute through stack and heap memory?
sabse pahle T print hoga,then new keyword se heap memory m X3 classs ka object ban jayega,or uska ref. code X3 k
var. m store ho jayega,then X3 ka constructor call hoga to wo stack m push ho jayega or usko memory allocate ho 
jayegi or object ko point krne lagega or X3 constructor m super statement call hoga to wo X2() ka constructor 
call or or stack m push hote hi X2 constructor ko memory allocate ho jayegi,then X2 constructor ka super call
hoga to X1 constructor stack m push ho jayega or memory allocate ho jayegi,then X1 constructor ka super statement
call hoga or object class ka constructor stack m push ho jayega or object constructor ko memory allocate ho jayegi
or object constructor bhi object ko point krne lagega,then super call complete ho jayega or Y print hoga then,
X2 constructor ka super call complete ho chuka h to wo pop-out ho jayega or A print hoga then W print hoga, then
D print hoga, at last X3 constructor bhi pop-out ho jayega,bolega alvida dosto mera call complete hua me ja rha 
hu! or stack m memory free ho jayegi.  */