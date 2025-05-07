class Teacher {
    //###########field################
    String name;
    int age;

    //######### constructor########
    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //#########method##########
    public String toString() {
        return name + " - " + age;
    }
}
