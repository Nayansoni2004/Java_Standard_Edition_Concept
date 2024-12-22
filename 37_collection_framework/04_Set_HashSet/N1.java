class N1 {
    //main method
    public static void main(String[] args) {
        Student x = new Student("Gurmeet" , 21);

        Student y = new Student("Gurmeet" , 21);

        System.out.println(x.equals(y));//equals()<-return type boolean.
        System.out.println(x == y);//double-equals operator(==) do obj. k ref. code m comparison krta h.
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
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        Student a = this;
        Student b = (Student)obj;//String obj. milega,isley type-cast krna padega Student m.

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.equals(nm2);//hum kewal name k basis pe comparison kr rhe h,name or age dono k basis pe kr sakte h.
    }
}
/*OUTPUT: equals() method ka output...
true */

/*OUTPUT: double-equals operator(==) ka output...
false */