import java.util.Scanner;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] x = new Student[3]; //array declaration cum instantiation

        for(Student s : x) {
            System.out.print(s + " "); //accessing & printing elements of an array without initialization
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i = 0 ; i < x.length ; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            x[i] = new Student(name, age);
        }
    }
}