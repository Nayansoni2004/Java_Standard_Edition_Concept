class M1 {
    //main method
    public static void main(String[] args) {

        Student s = new Student("Nayan", 19, "Btech", "CSE", 8);

        Teacher t = new Teacher("M K Nair", 45, 21, "PostDoc", 80000);

        System.out.println("~~~~~~~~~~~Student Info~~~~~~~Before~~~~~~");
        
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        /*s.name = "mohan";
        s.age = 22;
        s.degree = "Mtech";
        s.branch = "CSE";
        s.semester = 7;

        System.out.println("~~~~~~~~~~~Student Info~~~~~~~~~After~~~~~~");
        
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);  */

        System.out.println("~~~~~~~~~~~Teacher Info~~~~~~~Before~~~~~~");
        
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.experience);
        System.out.println(t.qualification);
        System.out.println(t.salary);

        /*t.name = "G K Mistri";
        t.age = 32;
        t.experience = 23;
        t.qualification = "PHd";
        t.salary = 60000;

        System.out.println("~~~~~~~~~~~Teacher Info~~~~~~~After~~~~~~");
        
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.experience);
        System.out.println(t.qualification);
        System.out.println(t.salary);  */
    }
}

class Student {
    //instance level variables
    String name;
    int age;
    String degree;
    String branch;
    int semester;

    Student(String name, int age, String degree, String branch, int semester) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}

class Teacher {
    //instance level variables
    String name;
    int age;
    int experience;
    String qualification;
    float salary;

    Teacher(String name, int age, int experience, String qualification, float salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.qualification = qualification;
        this.salary = salary;
    }
}
/* happily compiled.....
explanation in java copy M3.java example.
*/