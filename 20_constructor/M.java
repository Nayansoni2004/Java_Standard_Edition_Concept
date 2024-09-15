class M {
    //main method 
    public static void main(String[] args) {
        
        Student s = new Student();
        
        Teacher t = new Teacher();

        System.out.println("~~~~~~~~~~Student Info~~~~~~~~~~~Before~~~~~~");
        
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        s.name = "mohan";
        s.age = 21;
        s.degree = "BTech";
        s.branch = "CS";
        s.semester = 4;

         System.out.println("~~~~~~~~~~Student Info~~~~~~~~~~~After~~~~~~");
        
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        System.out.println("~~~~~~~~~~~Teacher Info~~~~~~~~~~~~Before~~~~~~~~");

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.experience);
        System.out.println(t.qualification);
        System.out.println(t.salary);

        t.name = "G K Mistri";
        t.age = 34;
        t.experience = 21;
        t.qualification = "PHd";
        t.salary = 50000;

        System.out.println("~~~~~~~~~~~Teacher Info~~~~~~~~~~~~After~~~~~~~~");

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.experience);
        System.out.println(t.qualification);
        System.out.println(t.salary);
    }
}

class Student {
    //instance level var.
    String name;
    int age;
    String degree;
    String branch;
    int semester;
}

class Teacher {
    //instance level var. 
    String name;
    int age;
    int experience;
    String qualification;
    float salary;
}
/* happily compiled.....
explanation in java copy M3.java example.
*/