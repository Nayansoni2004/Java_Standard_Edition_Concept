class Student {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student x = new Student();
        Student y = new Student();
    }

    void showInfo() {
        System.out.println(name);
    }
}
//happily compiled....