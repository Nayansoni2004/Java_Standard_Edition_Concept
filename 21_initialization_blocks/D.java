/*QUE: why we make instance-level initialization block?
ANS: we make instance initialization block to write the code steps which is repeated or similar in multiple 
    constructors matlab instance initialization block hum isley banate h,ki jo bhi steps multiple constructors
    m same h,wahi kam jo 1st constructor kr rha h wahi sare multiple constructors ko bhi krna pad rha h,isley hum
    wo steps jo multiple constructors m similar h wo sari steps hum initialization block m rakhte h,jis code
    redundancy minimize hoti h,kyuki construtor call hote hi super();call complete hone k baad instance 
    initialization blocks run hote h,or fir constructor ka bacha khucha code run hota h,isley jaise hi
    constructor call hoga super();call k baad har constructor m initialization blocks run ho jayenge to jo steps 
    similar h hum un ko initialization block m rakh dete h....see in next D1.java source file.   */
class D {
    //programmer supplied(NO-PARAMETERIZED)constructor
    D() {
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-a");
        System.out.println("step-b");
        System.out.println("step-c");
    }
    //overloaded constructor 1
    D(int n) {
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-X");
        System.out.println("step-Y");
        System.out.println("step-Z");
    }
    //overloaded constructor 2
    D(float m) {
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-M");
        System.out.println("step-N");
        System.out.println("step-O");
    }
    //main method
    public static void main(String[] args) {
        D a1 = new D();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D a2 = new D(12);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D a3 = new D(1.2f);
    }
}
/* OUTPUT: 
step-1
step-2
step-3
step-a
step-b
step-c
~~~~~~~~~~~~~~~~~~~~~~~~~~~
step-1
step-2
step-3
step-X
step-Y
step-Z
~~~~~~~~~~~~~~~~~~~~~~~~~~~
step-1
step-2
step-3
step-M
step-N
step-O
advantage of making instance-level initialization block we will see in D1.java source file.
*/