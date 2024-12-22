//Refined/cleaner implementation.
class O1 {
    //main method
    public static void main(String[] args) {
        Student x = new Student("Gurmeet" , 21);
        Teacher y = new Teacher("Gurmeet" , 21);

        System.out.println(x.equals(y));
    }   
}
class Teacher {
    String name;
    int age;

    Teacher(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}
class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;
        //obj m Teacher object milega..hum check kr rhe h ki,Teacher Student k sath is-a relationship pass krta h ya nhi. 
        if(obj instanceof Student) {//agar Teacher Student k sath is-a relationship pass krta h to hi if{}block run hoga,nhi to nhi hoga.
            Student a = this;
            Student b = (Student)obj;//Teacher obj. milega,isley type-cast krna padega Student m.

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }
        return flag; //agar if{}block run nhi hua to false output aayega,ye sahi tarika h ClassCastException se bachne ka.
    }
}
/*OUTPUT: false
false ouput aaya kyuki if{}block run nhi hua,to flag bit re-initialize nhi hui,or if{}block skip isley hua,kyuki
Teacher Student k sath is-a relationship pass nhi krta h,Teacher is-a Student<-wrong sound kr rha h,refined-
implementation isley h,kyuki O.java m ClassCastException aaya tha,isme flag bit ka use kia,to Atleast Exception
generate nhi hua,Problem-Solved.*/