class Employee {

    String name;
    int age;

    //main method....
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Drishti";
        emp.age = 18;

        emp.showInfo();
    }

    void showInfo() {
        showName();
        showAge();
    }

    void showName() {
        System.out.println(name);
    }

    void showAge() {
        System.out.println(age);
    }
}
//output:...
//Drishti
//18