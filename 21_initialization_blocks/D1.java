/*QUE: why we make instance-level initialization block?
ANS: we make instance initialization block to write the code steps which is repeated or similar in multiple 
    constructors matlab instance initialization block hum isley banate h,ki jo bhi steps multiple constructors
    m same h,wahi kam jo 1st constructor kr rha h wahi sare multiple constructors ko bhi krna pad rha h,isley hum
    wo steps jo multiple constructors m similar h wo sari steps hum initialization block m rakhte h,jis code
    redundancy minimize hoti h,kyuki construtor call hote hi super();call complete hone k baad instance 
    initialization blocks run hote h,or fir constructor ka bacha khucha code run hota h,isley jaise hi
    constructor call hoga super();call k baad har constructor m initialization blocks run ho jayenge to jo steps 
    similar h hum un ko initialization block m rakh dete h.*/
class D1 {
    //instance-level initialization block
    {
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    D1() {
        //System.out.println("step-1");
        //System.out.println("step-2");
        //System.out.println("step-3");
        System.out.println("step-A");
        System.out.println("step-B");
        System.out.println("step-C");
    }
    //overloaded constructor 1
    D1(int n) {
        //System.out.println("step-1");
        //System.out.println("step-2");
        //System.out.println("step-3");
        System.out.println("step-X");
        System.out.println("step-Y");
        System.out.println("step-Z");
    }
    //overloaded constructor 2
    D1(float m) {
        //System.out.println("step-1");
        //System.out.println("step-2");
        //System.out.println("step-3");
        System.out.println("step-M");
        System.out.println("step-N");
        System.out.println("step-O");
    }
    //main method
    public static void main(String[] args) {
        D1 a1 = new D1();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D1 a2 = new D1(12);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D1 a3 = new D1(1.2f);
    }
}
/* happily compiled and runned.....summary:jo bhi steps multiple constructors m similar/repeated h,unko repeat
na krna pade isley un steps ko instance-initialization block m rakhte h,jis se jub bhi construtor call ho,to uska
super();call complete hote hi instance-initialization block us instance pr run ho jaye jo object ban rha h.
*/