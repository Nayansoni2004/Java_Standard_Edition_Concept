class H1 {
    static void pro(Animal... x) {
        //iterating array of type Animal through Enhanced for-loop.
        for(Animal next : x) 
            System.out.println(next);
    }

    //main method
    public static void main(String[] args) {
        Cat t = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog g = new BDog();
        LivingBeing e = new BDog();

        pro(t, w, d, g, e);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDOg extends Dog { }

/*OUTPUT: error kyuki child class Animal[]<-array m parent type array LivingBeing assign nhi kr sakte,isley 
          error aayega.

D:\javaprac\47_var_args>javac H1.java
H1.java:16: error: method pro in class H1 cannot be applied to given types;
        pro(t, w, d, g, e);
        ^
  required: Animal[]
  found:    Cat,Cow,Dog,BDog,LivingBeing
  reason: varargs mismatch; LivingBeing cannot be converted to Animal
1 error
 */