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
        System.out.println(bablu);
    }

    static void inviteForDinner(Actor bablu) {
        System.out.println(bablu);
    }

    static void inviteForDinner(Player bablu) {
        System.out.println(bablu);
    }
}
/*
Each method takes a different class as a parameter (Singer, Actor, Player), and inside main() you're calling each one with the corresponding object.

Since all three classes extend Guest, they inherit Object’s toString() method (if not overridden). The default implementation returns: className@hashcode

D:\github_repos\javapractice\16_polymorphism> javac L.java
PS D:\github_repos\javapractice\16_polymorphism> java Host
Player@63961c42
Singer@65b54208
Actor@1be6f5c3
 */