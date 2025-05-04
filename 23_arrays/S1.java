class S1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BDog bdog = new BDog();

        Animal anm;

        anm = cat;
        System.out.println(anm);

        anm = cow;
        System.out.println(anm);

        anm = dog;
        System.out.println(anm);

        anm = bdog;
        System.out.println(anm);
    }
}
/* no explicit conversion needed while assiging objects of(cat, cow , dog, bdog) into animal (anm var.) because
   animal is parent of these sub-classes. 
 OUTPUT
Cat@1be6f5c3
Cow@6b884d57
Dog@38af3868
BDog@77459877
 */