class D {
    public static void main(String[] args) {
        BDog x = new BDog();

        // Case 1:
        if(x instanceof BDog) 
            System.out.println("BDog Object IS-A BDog");

        // Case 2:
        if(x instanceof Dog)
            System.out.println("BDog Object IS-A Dog");
        
        // Case 3:
        if(x instanceof Animal)
            System.out.println("BDog Object IS-A Animal");
        
        // Case 4:
        if(x instanceof LivingBeing)
            System.out.println("BDog Object IS-A LivingBeing");

        // Case 5:
        if(x instanceof Object)
            System.out.println("BDog Object IS-A Object");
        
        // Case 6:
        // if(x instanceof Human)
        //     System.out.println("BDog Object IS-A Human");
        //     else
        //         System.out.println("BDog Object IS-not-A Human");
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Human extends LivingBeing { }
class Dog extends Animal { }
class BDog extends Dog { }

/*💡 Key Point:
1.Demonstrated multi-level inheritance using instanceof to check object relationships, resulting in a compilation error when attempting an invalid type check (BDog cannot be converted to Human).

2.Java prevents invalid type comparisons between unrelated classes at compile time to ensure type safety.

OUTPUT: 
D:\github_repos\javapractice\15_inheritance> javac D.java
D.java:26: error: incompatible types: BDog cannot be converted to Human
        if(x instanceof Human)
           ^
1 error
 */