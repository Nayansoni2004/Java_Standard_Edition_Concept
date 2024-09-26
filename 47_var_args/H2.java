class H2 {
    static void pro(Animal... x) {
        //iterating array of type Animal through Enhanced-for Loop.
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

        pro(t, w, d, g, (BDog)e);//<-type-cast kia h LivingBeing ko BDog m.
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cow extends Animal { }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }

/*OUTPUT: compiler type-checking krta h to hum array of type Animal m array of type LivingBeing nhi rakh  sakte,
          kyuki LivingBeing child nhi h Animal ka isley hum ne LivingBeing ref. var. ko pro()method m BDog m 
          type-cast kr dia h,or kyuki BDog indirect child h Animal ka to hum BDog ko array of type Animal m
          rakh sakte h,to legal code h.ref. code print honge.
D:\javaprac\47_var_args>javac H2.java

D:\javaprac\47_var_args>java H2
Cat@372f7a8d
Cow@2f92e0f4
Dog@28a418fc
BDog@5305068a
BDog@1f32e575   
 */