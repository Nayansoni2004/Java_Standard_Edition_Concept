class Student {
    static String name;
    static int age;

    //Main Method Banayenge Ab...
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Nayan";
        x.age = 19;

        Student y = new Student();
        y.name = "Drishti";
        y.age = 18;

        Student z = new Student();
        z.name = "Khushi";
        z.age = 17;

        System.out.println(x.age);
        System.out.println(y.name);
    }
}
//D:\javaprac\3_static_non-static>java Student
//17
//Khushi