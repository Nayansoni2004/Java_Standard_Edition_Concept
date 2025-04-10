class O1 {
    public static void main(String[] args) {
        SpiderMan y = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForDinner(z);
        inviteForDinner(y);
    }

    static void inviteForDinner(SuperHuman x) {
        System.out.println("Namaste + ");
        System.out.println("Serve Food + ");
    }

    // static void inviteForDinner(SpiderMan x) {
    //     System.out.println("Namaste ");
    //     System.out.println("Serve Food ");
    // }

    // static void inviteForDinner(ShaktiMan x) {
    //     System.out.println("Namaste ");
    //     System.out.println("Serve Food ");
    // }
}
/*
D:\github_repos\javapractice\16_polymorphism> java O1
Namaste + 
Serve Food + 
Namaste + 
Serve Food +
 */
/*
🤖 Polymorphism Involved:
This is compile-time polymorphism (method overloading):

The decision of which method to call is made at compile time.

Since both objects are compatible with SuperHuman, the same method gets called twice.
 */