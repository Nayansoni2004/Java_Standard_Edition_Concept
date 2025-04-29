class Teacher {
    //instance-level var. member
    String name;
    int age;

    //programmer supplied(two-PARAMETERIZED)constructor
    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //instance-level method member...
    public String toString() {
        return name + " - " + age;
    }
}