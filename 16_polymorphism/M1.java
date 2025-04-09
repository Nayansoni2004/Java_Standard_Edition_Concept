class Host {
    public static void main(String[] golu) {
        Singer a = new Singer();
        Actor x = new Actor();
        Player y = new Player();

        inviteForDinner(y);
        inviteForDinner(a);
        inviteForDinner(x);
    }

    static void inviteForDinner(Guest bablu) {
        System.out.println("welcome guest");
        System.out.println("serve food");
    }

    // static void inviteForDinner(Singer bablu) {
    //     System.out.println("welcome guest");
    //     System.out.println("serve food");
    // } 

    // static void inviteForDinner(Actor bablu) {
    //     System.out.println("welcome guest");
    //     System.out.println("serve food");
    // }

    // static void inviteForDinner(Player bablu) {
    //     System.out.println("welcome guest");
    //     System.out.println("serve food");
    // }
}
/*
D:\github_repos\javapractice\16_polymorphism> java Host
welcome guest
serve food
welcome guest
serve food
welcome guest
serve food

Each guest is welcomed and served food using the base method.
This is compile-time polymorphism using only the parent class method.
Demonstrated compile-time polymorphism using method overloading with only the base class method active; all subclass objects (Singer, Actor, Player) are handled by the Guest parameter method due to absence of specific overloads.
 */
/*
 Conclusion
This code is a clear example of compile-time polymorphism where:

Multiple overloaded methods exist.

The version to call is decided at compile time based on the reference type.

If you used runtime polymorphism (method overriding), the call would be based on the object's type, not reference type.
 */