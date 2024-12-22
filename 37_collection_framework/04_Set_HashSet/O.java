class O {
    //main method
    public static void main(String[] args) {
        Student x = new Student("Gurmeet" , 21);
        Teacher y = new Teacher("Gurmeet" , 21);

        System.out.println(x.equals(y));//hamari banai hui Student class ki equals() method call hogi.
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
        Student a = this;
        Student b = (Student)obj;//Teacher class ka obj. milega to class Student obj. m cast krna padega,but Cast nhi kr sakte.

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.equals(nm2);
    }
}
/*OUTPUT:line no.38 class Teacher ka obj. milega,usko class Student k obj. m type-cast kr ry h,jo ki loader app 
         k unnamed module m h,isley runtime pe(Unchecked)ClassCastException aaya!
Exception in thread "main" java.lang.ClassCastException: class Teacher cannot be cast to class Student (Teacher and Student are in unnamed module of loader 'app')
        at Student.equals(O.java:38)
        at O.main(O.java:7) */