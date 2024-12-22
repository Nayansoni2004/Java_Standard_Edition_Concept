class N {
    //main method
    public static void main(String[] args) {
        Student x = new Student("Gurmeet" , 21);

        Student y = new Student("Gurmeet" , 21);

        System.out.println(x.equals(y));//return false bec. equals() will match x & y objects. ref. code.
        System.out.println(x == y); //return false bec. ==(equality operator)is a process of equals() method.
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
}
/*OUTPUT:kyuki humne Student class m Object class ki equals()method override kr k implement nhi ki h,isley wo
         x or y dono obj. k ref. code ==(double equality)operator se comparison kregi jo ki kabhi same nhi ho 
         sakte isley false aaya,or double-equals operator(==) bhi same kam krta h do obj. k ref. code m comparison
         krta h,isley false output generate hua.
false
false */