class F {
    //main method
    public static void main(String[] args) {
        Animal a = null;

        // a = new BDog();
        // a = new Cat();
        // a = new Cow();
        // a = new Dog();
        a = new Animal();

        a.makeSound();
        //Runtime Polymorphism: Dynamic Method Dispatch-> konse class ka method run hoga ye runtime pe decide
        //                      krna dynamic method dispatch kehlata h. 
    }
}

/*
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
Animal Sound
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
Dog Sound
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
Cow Sound
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
Cat Sound
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
BDog Sound
PS D:\github_repos\javapractice\18_overriding> javac F.java
PS D:\github_repos\javapractice\18_overriding> java F
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Animal.makeSound()" because "<local1>" is null
        at F.main(F.java:12)
 */