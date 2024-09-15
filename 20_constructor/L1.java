//concept: when the default constructor is provided then,why we make our own constructor?
class Student {
    //instance level var. member
    String name;
    int age;

    Student(String nm, int ag) {
        name = nm;
        age = ag;
    }
}

class L1 {
    //main method
    public static void main(String[] args) {

        Student x = new Student("Nayan",18);

        System.out.println(x.name);
        System.out.println(x.age);

        //x.name = "Nayan";
        //x.age = 18;

        //System.out.println(x.name);
        //System.out.println(x.age);
    }
}  /*  OUTPUT:
Nayan
18
class k instance members us class ka object ban ne pr class ki picture m aate h,new keyword se heap memory m
plan object ban jayega or object bante hi Student class k members name or age ko memory allocate ho jayegi,kyuki
humne name or age var. ko explicitely koi value assign nhi ki h isley compiler implicitely name var. ko null or 
age var. ko zero se initialize kr dega,or object ka ref. code Student ref. var. x m jake hold ho jayega,then
Student()constructor call hoga to Student()constructor ka super();parent call hoga or object()constructor stack 
up ho jayega or object class k methods Student object se attach ho jayenge,now object constructor ka call end hua
ab Student()constructor ka call resume hoga or 2nd statement run hoga or nm or ag var.ko stack memory allocate 
ho jayegi or Student()constructor ka parameterized "" string treat hoga or Nayan jake name m initialize ho jayega,
or 18 int value treat hoga or jake age var. m store ho jayega,or jaise hi x.name ko call krenge to Nayan print
hoga or x.age ko call krenge to 18 print hoga,conclusion: constructor jub bana milta h to hum kyu banate h,isley 
banate h ,jub hume object create krne k samay variables ko initial value se set krna ho or jis se hum,parameter
pass kr k var. ko direct initialize kr sake or baad m initialize krne ki jarurat nhi hoti.  */