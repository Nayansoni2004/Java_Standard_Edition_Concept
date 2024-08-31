class Student {
    String name;
    int age;

    static int maxAge = 20;

    //main method banayeng ab...
    public static void main(String[] args) {
        Student x = new Student();
        Student y = new Student();

        x.name = "Drishti";
        x.age = 18;

        y.name = "Nayan";
        y.age = 19;

        showInfo();
    }

    void showInfo() {
        System.out.println(name);
    }
}
//N.java:18: error: non-static method showInfo() cannot be referenced from a static context
//        showInfo();
//        ^
//1 error