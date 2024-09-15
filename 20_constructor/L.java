class Student {
    //instance level var. members
    String name;
    int age;
}

//test class
class L {
    //main method
    public static void main(String[] args) {

        Student x = new Student();

        System.out.println(x.name);
        System.out.println(x.age);

        x.name = "NayanSoni";
        x.age = 19;

        System.out.println(x.name);
        System.out.println(x.age);
    }
} /* OUTPUT:  
null
0
NayanSoni
19
class k instance level members us class ka object ban ne pr class ki picture m aate h,Student class k members
us class ka instance ban ne pr class se register ho jayenge,new keyword se heap memory m plan object ban jayega
or object bante hi instance members name or age var. ko memory allocate ho jayegi,kyuki humne koi explicit value
assign nhi ki h,isley name var. null se initialize ho jayega,or age var. zero se initialize ho jayega,then Student()
constructor call hoga or Student class type ref. var. x m Object ka ref. code jake hold ho jayega,then print statement
m ref. var. dot name k through name ko print kr rhe h to null print hoga or ref. var. dot age k through call krne
pr 0 print hoga then next instruction run hoga or ref. var. dot name m NayanSoni jake null k upar override ho jayega
or ref. var. dot age m 0 override hoke 19 ho jayega,or ab ref. var. dot name ko call krne pr NayanSoni print hoga
or ref. var. dot age ko call krne pr 19 print hoga,then main method ka execution complete hoga or stack empty ho
jayega.  */