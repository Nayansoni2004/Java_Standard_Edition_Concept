class K1 {
    //non-instance level var. member
    static int count;
 //programmer supplied constructor..
    K1() {
        count = count + 1;
    }
    //main method
    public static void main(String[] args) {

        K1 a1 = new K1();
        K1 a2 = new K1();
        K1 a3 = new K1();
        K1 a4 = new K1();
        K1 a5 = new K1();

        System.out.println(a1.count);
        System.out.println(a2.count);
        System.out.println(a3.count);
        System.out.println(a4.count);
        System.out.println(a5.count); 

    }
}  /* OUTPUT: 
5
5
5
5
5
class k instance members us class ka object ban ne pr class ki picture m aate h,but K1 class
ka member static h matlab non-instance level h,isley to wo class k load hone pr hi usko memory 
allocate ho jayegi,or class m register ho jayega,to direct bhi access kr sakte h,or jub new se heap memory m plan
object ban jayega or humne static count var. ko koi explicit value assign nhi ki h,isley compiler zero se initialize
kr dega,or jub K1()constructor call hoga to super(); parent ka Object()constructor call hoga or stack up ho jayega
then,Object class k instance methods K1 class k objects se attach ho jayenge or object()constructor ka call complete
hua wo popout ho jayega then,K1() constructor ka call resume hoga or count = count+1; statement run hoga,or count
jo implicit 0 se initialize h wo 0+1 hoga or 1 jake count var. m store ho jayega,or main method ka next instruction
run hoga new se 1 or plan object ban jayega or K1()constructor call hoga,to uska super(); parent Object constructor
call hoga or object class k methods K1 object se attach ho jayenge then K1()constructor ka call resume hoga or
next line run hoga count=count+1; or kyuki count var. static h isley wo 1+1 hoga or 2 jake count var. m override 
ho jayega...yahi process again hogi to count var. ki value override hoke 3 ho jayegi...then,ye process again hogi
to count var. ki value override hoke 4 ho jayegi,then yahi step again repeat hogi to count var. ki value override 
hoke 5 ho jayegi or kyuki value override hui h,redefine hui h isley ...ref. var. dot count jub bhi call krenge to
compiler jaha ref. var. name hoga waha waha pr class ka name K1 likh dega or har bar 5 override hui value print
hogi.   */