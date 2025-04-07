class Host {
    public static void main(String[] args) {
        Singer a = new Singer();
        Actor x = new Actor();
        Player y = new Player();

        inviteForDinner(y);
        inviteForDinner(a);
        inviteForDinner(x);
    }

    static void inviteForDinner(Singer bablu) {
        System.out.println("Welcome guest");
        System.out.println("serve food");
    }

    static void inviteForDinner(Actor bablu) {
        System.out.println("Welcome guest");
        System.out.println("serve food");
    }

    static void inviteForDinner(Player bablu) {
        System.out.println("Welcome guest");
        System.out.println("serve food");
    }
}
/*
This is compile-time polymorphism (method overloading).

All methods have identical behavior.

D:\github_repos\javapractice\16_polymorphism> java Host
Welcome guest
serve food
Welcome guest
serve food
Welcome guest
serve food
 */