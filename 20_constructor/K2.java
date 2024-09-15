class K2 {
    //non-instance level var. member
    static int count;
    //constructor
    K2() {
        count = count + 1;
    }
    //main method
    public static void main(String[] args) {

        K2 a1 = new K2();
        System.out.println(a1.count);
        K2 a2 = new K2();
        System.out.println(a1.count);
        K2 a3 = new K2();
        System.out.println(a1.count);
        K2 a4 = new K2();
        System.out.println(a1.count);
        K2 a5 = new K2();
        System.out.println(a1.count);
    }
}  /* OUTPUT:
1
2
3
4
5
class k instance members us class ka object ban ne pr class ki picture m aa jate h,but K2 class m non-instance 
level memeber h,or count var. ko class k load hone pr hi memory allocate ho jayegi,or kyuki count var. ko humne
koi explicit value se initialize nhi kia h isley compiler implicitely zero se initialize kr dega,or new keyword
se 1 plan object heap memory m ban jayega or K2 class ke a1 ref. var. ko stack m memory allocate ho jayegi,
or k2()constructor call hoga or K2()constructor ka super(); parent object()constructor call hoga or Object class
ke methods K2 object se attach ho jayenge,or object()constructor ka call end hote hi,K2()constructor ka call
resume hoga or K2()constructor ka next statement count= count+1; run hoga to count var. jo implicitely zero se 
initialize tha wo 0+1 hoga to 1 jake count var. m store ho jayega,then main method ka next instruction run hoga
to ref.var. dot coun var. call hote hi 1 print hoga,then new se again plan object ban jayega same process hogi
or kyuki ab count ki var. ki value 1 h to 1+1 hoga to 2 jake count var. m store ho jayega or print statement run
hoga to 2 print hoga ,,,then new se again object banega same process hogi or kyuki count ki value override ho
rhi h isley ab 3 print hoga then same process k baad override hoke 4 print ho then again after same process
4 override(redefine) hoke 5 aayega or 5 print hoga,,,,kyuki member static h or jaha jaha print statement m hum 
ref.var. dot krke print kr rhe h waha waha compiler class ka name K2.count likh dega,,ye compiler ka implicit work
h andar hi andar.isley 12345 print hua.   */  