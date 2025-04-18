//most imp example...
class G1 {
    static void playSound(Animal d) {
        d.makeSound();
    }

    // static void playSound(Dog d) {
    //     d.makeSound();
    // }

    // static void playSound(Cat d) {
    //     d.makeSound();
    // }

    // static void playSound(Cow d) {
    //     d.makeSound();
    // }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        playSound(dog);
        playSound(cat);
        playSound(cow);
    }
}
/*
This is called Dynamic Method Dispatch (a.k.a. Runtime Polymorphism)
At compile time, the compiler only checks that makeSound() exists in the Animal class.
At runtime, JVM checks the actual object type and calls the overridden method in that class.



D:\github_repos\javapractice\18_overriding> java G1
Dog Sound
Cat Sound
Cow Sound
 */