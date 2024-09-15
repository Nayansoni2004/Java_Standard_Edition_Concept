class Student {
    //instance level var. members
    String name;
    String email;
    String password;
    String degree;
    String branch;
    String semester;

    Student(String email, String password) {
        
        this.email = email;
        this.password = password;
    }

    Student(String name, String email, String password, String degree, String branch, String semester) {

        this(email, password); //this()parenthesis ka use apne hi class k overload constructor ko call krne k liye krte h.
        this.name = name;
        //this.email = email;
        //this.password = password;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}

class N1 {
    //main method 
    public static void main(String[] args) {

        Student s2 = new Student("rocky", "rocky@gmail.com", "12345", "BTech", "IT", "4th");

        System.out.println("~~~~~~~~~~Student 2 SignUp~~~~~~~~~~~~");

        System.out.println("Name: " + s2.name);
        System.out.println("Email :" + s2.email);
        System.out.println("Password: " + s2.password);
        System.out.println("Degree: " + s2.degree);
        System.out.println("Branch :" + s2.branch);
        System.out.println("Semester: " + s2.semester); 
    }
}
/* ~~~~~~~~~~Student 2 SignUp~~~~~~~~~~~~
Name: rocky
Email :rocky@gmail.com
Password: 12345
Degree: BTech
Branch :IT
Semester: 4th
                   happily compiled......
                   explanation through stack memory in java-copy N1.java example.*/