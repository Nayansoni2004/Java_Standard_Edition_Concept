//concept: how to know that how many objects of a class are created? 
class K {
    //instance level member.
    int count;

    K() {
        count = count + 1;
    }
    //main method 
    public static void main(String[] args) {
        K a1 = new K();
        K a2 = new K();
        K a3 = new K();   
        K a4 = new K();
        K a5 = new K();

        System.out.println(a1.count);
        System.out.println(a2.count);
        System.out.println(a3.count);
        System.out.println(a4.count);
        System.out.println(a5.count);
    }
}
/* OUTPUT: 
1
1
1
1
1
class ke instance members us class ka object ban ne pr class ki picture m aate h,or K class ka object ban ne pr
K class ke instance member count ko memory allocate ho jayegi,kyuki humne koi explicit value assign nhi ki h,
isley compiler count var. ko zero se initialize kr dega.fir K()constructor call hoga to K()constructor ka first
line statement super(); parent call hoga to object()constructor stack up ho jayega or object class ke instance 
methods, K class ke object se attach ho jayenge,ab Object() constructor ka call complete hua or K()constructor
ka call resume hoga,or second statement run hoga jo likha h count = count + 1;to count var. jo zero se initialize
h wo 0+1 hoga to 1 jake count var. m assign ho jayega or a1 var. m object ka ref. code jake hold ho jayega,or 
jub ref. var. k through count var. ko print krenge i.e. a1.count to 1 print hoga.
step 2 m again new keyword se heap memory m plan object ban jayega or K class k instance member count ko memory
allocate ho jayegi,or kyuki humne koi explicit value assign nhi ki h,isley implicit value zero initialize ho jayegi,
then K()constructor call hoga or to super(); parent call hoga or Object() constrctor stack up
ho jayega or Object class ke instance methods K class ke object se attach ho jayenge,then object() ka call complete
hua or K()constructor ka call resume hoga or 2nd line statement run hoga count= count+1; to count var.jo implicitely
zero se initialize h wo 0+1 hoga or 1 se initialize ho jayega,or object ka ref. code a2 var. m store ho jayega,
then jub bhi ref. var. dot count ko call krenge to 1 print hoga kyuki 0 k upar 1 aa gya h or 0 hide ho gya h.

step3,step4,step5 so on..... or jitne bhi step m object banayenge sub me same process repeat hogi object banaega 
memory allocate hogi 0 ze initialize hoga const.() call hoga etc...jitne object banege har bar 1 print hoga 
kyuki ,class ka member instance level h.  */
