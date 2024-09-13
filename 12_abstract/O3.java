abstract class Z {

    //method members 
    abstract void SayHello();//pascal case:first letter of an identifier is always in upper-case.
    abstract void ShowInfo();//pascal case:first letter of an identifier is always in upper-case.

}

class O3 extends Z {

    void SayHello() {
        System.out.println("Hello");
    }
    void ShowInfo() {
        System.out.println("User Information:");
    }
    //main method
    public static void main(String[] args) {

        O3 x = new O3();

        x.SayHello();
        x.ShowInfo();
        x.Update();
        x.ShowProfile();

    }
    void Update() {
        System.out.println("click for update:");
    }
    void ShowProfile() {
        System.out.println("your current profile is:");
    }

}
/* happily compiled and runed....
Hello
User Information:
click for update:
your current profile is:
*/