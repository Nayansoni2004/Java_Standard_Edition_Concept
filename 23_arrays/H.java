class H {
    //main method.
    public static void main(String[] args) {
        Student x1 = new Student("nayan", 12);
        Student x2 = new Student("prayank", 17);
        Student x3 = new Student("drishti", 15);
        Student x4 = new Student("anshul", 19);

        //array declaration cum instantiation
        Student[] y = new Student[4]; 

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println(y[3]);

        y[0] = x1;
        y[1] = x2;
        y[2] = x3;
        y[3] = x4;

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println(y[3]);
    }
}

class Student {
    //instance-level var. declaration...
    String name;
    int age; 

    //programmer supplied(2 parameterized)constructor...
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //instance-level method...
    public String toString() {
        return name + " - " + age;  //method ka return type String h isley method ka vada h ki wo kuch return kregi...
    }
}
/* obj. ref. var. pr internally toString() method call ho jata h,jub print statement m call krte h ref. var. ko!
OUTPUT:
null
null
null
null
nayan - 12
prayank - 17
drishti - 15
anshul - 19
*/