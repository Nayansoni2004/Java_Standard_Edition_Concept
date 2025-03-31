class F {
    public static void main(String[] args) {
        LivingBeing x = new Cat();
        LivingBeing y = new Cow();
        LivingBeing z = new Dog();
        LivingBeing t = new BDog();
    }
}
/*
happily compiled along with LivingBeing, Cat, Cow, Dog, BDog, .java also
D:\github_repos\javapractice\16_polymorphism> javac F.java

Demonstrated polymorphism with parent class references across multiple subclass files also parent class livingbeing and sub-classes cow, cat, dog, bdog are in the different .java files lying in the same folder in which main class F is created.
 */