class G {
    static void playSound(Dog d) {
        d.makeSound();
    }    

    static void playSound(Cat d) {
        d.makeSound();
    }

    static void playSound(Cow d) {
        d.makeSound();
    }

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
The appropriate playSound() version is chosen at compile time based on the argument type.
At runtime, each object's makeSound() method executes.

D:\github_repos\javapractice\18_overriding> java G
Dog Sound
Cat Sound
Cow Sound
 */