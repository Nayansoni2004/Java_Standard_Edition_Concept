import java.util.Scanner;

class A {
    //main method
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);//<-user-input.

        System.out.print("Enter Adv Java Start Day: ");

        String day = sc.nextLine();

        System.out.println("Start Day: " + day);

        sc.close();
    }
}
/*OUTPUT:is example m user-input liya h String var. day or print kraya h.
D:\javaprac\46_enum>javac A.java

D:\javaprac\46_enum>java A
Enter Adv Java Start Day: SUNDAY
Start Day: SUNDAY
 */