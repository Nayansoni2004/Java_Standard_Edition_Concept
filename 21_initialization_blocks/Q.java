class Q {
    //instance-level var. member
    int x = 9;
    //instance initialization block
    {
        System.out.println("Hello");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    Q() {
        //super();
        //inst. var. and inst. init. blocks and inst. methods
        System.out.println("Bye");
    }
    //instance-level method member
    void pro() {
        System.out.println("Hi");
    }
    //main method
    public static void main(String[] args) {
        Q q = new Q();
    }
}
/* OUTPUT: Hello
           Bye
class load hogi or classObject ban jayega lekin Q class m na hi static var. static method or na hi static 
initialization block h to direct main method se execution start hoga or stakc m q obj. ref. var. ban jayega then
new keyword se heap memory m plan object ban jayega or Q()constructor call hoga or uska super();call hoga to object
()constructor stack up ho jayega or object class k saare instance methods us Qinstance se attach ho jayenge then,
instance initialization block us instance pr automatic run ho jayega or "Hello" print hoga then, Q()constructor 
ka call resume hoga or bacha code run hoga to "Bye" print ho jayega or Qobject ka ref. code qobj. ref. var. m 
aake store ho jayega,or execution end ho jayega.method ka "Hi" print nhi hua,kyuki method call hi nhi kiya or 
method ka code bina call kiye run nhi hota,method ko call krna padta h,or instance var. x print nhi hua kyuki x 
var. ko access hi nhi kia! */ 