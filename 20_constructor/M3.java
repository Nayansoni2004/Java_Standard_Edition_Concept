class M3 {
    //main method
    public static void main(String[] args) {

        Student s = new Student("Rocky", 21, "Mtech", "CSE", 8);

        System.out.println("~~~~~~~~Student Info~~~~~~~~Before~~~~~~~~~");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        Teacher t = new Teacher("M K Fire", 32, "PostFix", 22, 90000);

        System.out.println("~~~~~~~~~~~Teacher Info~~~~~~~~~~Before~~~~~~~~~");

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.experience);
        System.out.println(t.salary);       
    }
}

class User {
    //instance level var. members...
    String name;
    int age;

    User(String name, int age) {
        
        this.name = name;
        this.age = age;
    }
}

class Student extends User {
    //instance level var. members
    //String name;
    //int age;
    String degree;
    String branch;
    int semester;

    Student(String name, int age, String degree, String branch, int semester) {

        super(name, age);
        //this.name = name;
        //this.age = age;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}

class Teacher extends User {
    //instance level var. members 
    //String name;
    //int age;
    String qualification;
    int experience;
    float salary;

    Teacher(String name, int age, String qualification, int experience, float salary) {

        super(name, age);
        //this.name = name;
        //this.age = age;
        this.qualification = qualification;
        this.experience = experience;
        this.salary = salary;

    }
}
/* ~~~~~~~~Student Info~~~~~~~~Before~~~~~~~~~
Rocky
21
Mtech
CSE
8
~~~~~~~~~~~Teacher Info~~~~~~~~~~Before~~~~~~~~~
M K Fire
32
PostFix
22
90000.0  */
/* happily compiled.....
explanation in java-copy M3.java example.
*/