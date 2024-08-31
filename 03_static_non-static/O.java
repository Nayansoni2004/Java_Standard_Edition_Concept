class Studdnt {
    String name;
    int age;

    static int maxAge = 20;

    //main method banayenge...
    public static void main(String[] args) {
        Student x = new Student();
        Student y = new Student();

        x.name = "Drishti";
        x.age = 18;

        y.name = "Nayan";
        y.age = 19;

        x.showInfo();
    }

    void showInfo() {
        System.out.println(name);
    }
}
//O.java:18: error: cannot find symbol
//        x.showInfo();
//         ^
//  symbol:   method showInfo()
//  location: variable x of type Student
//1 error