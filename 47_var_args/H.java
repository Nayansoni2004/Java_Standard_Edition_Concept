class H {
    static void pro(Animal... x) {
        //iterating array of type animal through Enhanced-for-loop.
        for(Animal next : x) 
            System.out.println(next);
    }

    //main method
    public static void main(String[] args) {
        Cat t = new Cat();
        Cow w = new Cow();
        Dog g = new Dog();
        BDog b = new BDog();

        pro(t, w, g, b);
    }
}
class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }

/*OUTPUT: example of polymorphic assign Using var_Args.
D:\javaprac\47_var_args>javac H.java

D:\javaprac\47_var_args>java H
Cat@372f7a8d
Cow@2f92e0f4
Dog@28a418fc
BDog@5305068a
 */