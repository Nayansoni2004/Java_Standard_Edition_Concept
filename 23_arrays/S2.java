class S2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BDog bdog = new BDog();

        Animal[] x = {cat, cow, dog, bdog}; //no explicit conversion needs bec. these are sub-types of Animal.

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
    }
}
/* OUTPUT
Cat@1be6f5c3
Cow@6b884d57
Dog@38af3868
BDog@77459877
 */