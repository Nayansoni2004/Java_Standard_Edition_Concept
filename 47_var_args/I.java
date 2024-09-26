class I {
    static void pro(Animal... x) {//<-internally array of type Animal create hoga...
        System.out.println(x[0]);//ref. code of index 0 print hoga,means d ref. var. ka
        System.out.println(x[1]);//ref. code of index 1 print hoga,means c ref. var. ka
    }

    //main method
    public static void main(String[] args) {
        Dog d = new Dog();//<-obj.(1)
        Dog c = new Dog();//<-obj.(2)

        Dog[] m = {d , c};//<-ref. varaiables...

        pro(m);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }

/*OUTPUT:array of type Dog ko array of type Animal m assign kr sakte h kyuki Animal or Dog m direct parent-child
         relationship h.or x[0]<-pe d var. ka ref. code print hoga,or x[1]<-pe c var. ka ref. code print hoga.
D:\javaprac\47_var_args>javac I.java

D:\javaprac\47_var_args>java I
Dog@5ca881b5
Dog@24d46ca6
 */