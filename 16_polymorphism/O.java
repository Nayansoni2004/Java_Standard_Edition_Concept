class O {
    public static void main(String[] args) {
        SpiderMan y = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForDinner(z);
        inviteForDinner(y);
    }

    static void inviteForDinner(SpiderMan x) {
        System.out.println("Namaste ");
        System.out.println("Serve Food");
    } 

    static void inviteForDinner(ShaktiMan x) {
        System.out.println("Namaste ");
        System.out.println("Serve Food");
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> java O
Namaste 
Serve Food
Namaste 
Serve Food
 */
/*
This is compile-time polymorphism, because:

The method that gets called is determined at compile time, not at runtime.

It’s achieved by having multiple methods with the same name but different parameters (overloading).
 */