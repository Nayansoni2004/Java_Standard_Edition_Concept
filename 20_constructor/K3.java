class K3 {
    //non-instance level var. member
    static int count;
//constructor
    K3() {
        count = count + 1;
    }
    //main method
    public static void main(String[] args) {
        
        K3 a1 = new K3();
        System.out.println(a1.count);
        K3 a2 = new K3();
        System.out.println(a2.count);
        K3 a3 = new K3();
        System.out.println(a3.count);
        K3 a4 = new K3();
        System.out.println(a4.count);
        K3 a5 = new K3();
        System.out.println(a5.count);
    }
}/* D:\javaprac\20_constructor>java K3
1
2
3
4
5
class k instance members us class ka object ban ne pr class ki picture m aa jate h,but K3 class m non-instance 
level member h or static members class k load hone pr hi 1 bar load ho jate h,main method se code ka execution
start hoga or new keyword se heap memory m plan object ban jayega,or object bante hi class k instance members ko
memory allocat ho jayegi,or kyuki hum ne count var. ko koi explicit value assign nhi kri h,isley compiler count 
var. ko 0 se initialize kr dega,or K3 class ke object ka ref. code K3 class type var. m store ho jayega,or K3()
constructor call hoga to K3()constructor ka super(); parent object()constructor stack m push ho jayega or Object 
class k methods K3 Object se attach ho jayege,or object constructor ka call complete hua,then K3()constructor 
ka call resume hoga or count var. jo implicitely 0 se initialize h wo 0+1 hoga to 1 jake count var. m store ho
jayega,or main method ka next statement run hoga or 1 print hoga....yahi step again & again repeat hogi jub-jub
new keyword se object banega or constructor call hoga,or kyuki class ka member static h to jub bhi hum ref.var.
k through member ko access krenge to compiler ref.var. ki jagah class name K3 likh dega matlab K3.count har print
line m likh dega, to count var. ki value override hoti jayegi or print krte jayenge har object ban ne k baad 
isley....12345 print hua.  */