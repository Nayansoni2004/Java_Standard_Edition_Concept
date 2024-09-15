//this keyword ka use jub local var. or instance var. ka name same ho to instance var. ko point krne k liye krte h.
class Employee {
    //instance level var. members
    String name;
    int age;
//Employee constructor hum ne banaya h isley koi bhi access control laga sakte h!
    public Employee(String name, int age) {
        this.name = name; //this matlab Employee class ka String name var.! or name matlab constructor ka parameter name mohan.
        this.age = age;
    }
}

class L2 {
    //main method 
    public static void main(String[] args) {

        Employee e = new Employee("mohan",32);

        System.out.println(e.name);
        System.out.println(e.age);
    }
} /* OUTPUT: 
mohan
32
class k instance members us class ka object ban ne pr class ki picture m aate h,new keyword se heap memory m plan
object ban jayega or object bante hi Employee class k instance members name or age ko memory allocate ho jayegi,
kyuki hume ne name or age var. ko explicitely value se assign nhi kia h isley compiler implicitely name var. ko 
null se or age ko 0 ze initialize kr dega,or e object ref. var. m jake object ka ref. code hold ho jayega,then 
Employee()constructor call hoga or Employee()constructor ka super();parent Object()constructor call hoga or 
object class k methods Employee object se attach ho jayenge,ab object()constructor ka call end hua then,Emloyee()
constructor ka call resume hoga,or 2nd statement run hoga this.name matlab Employee class ka instance var. name
jo null se initialize h usme =name matlab Employee constructor ka name mohan assign kr do or this.age matlab 
Employee class ka instance var. age m =age matlab Employee()constructor ka int32 usme assign kr do...or jaise hi
class ref. var. k through name var. ko call krenge to mohan print hoga or age call krnege to 32 print hoga...
*/