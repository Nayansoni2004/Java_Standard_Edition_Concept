import java.util.Scanner;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] x = new Student[3]; //array declaration cum instantiation

        //for-each loop
        for(Student s : x) {
            System.out.print(s + " "); //accessing & printing elements of an array without initialization
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //classic for loop
        for(int i = 0 ; i < x.length ; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            x[i] = new Student(name, age);
            sc.nextLine(); // to consume leftover \n after nextInt()
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //for-each loop
        for(Student s : x) {
            System.out.println(s); //printing elements of an array x after initialization
        }

        sc.close();
    }
}
/* sc.nextLine() lagana zaruri hai kyunki nextInt() ke baad \n buffer me reh jata hai jo agla nextLine() 
   read kar leta hai (junk me).
OUTPUT
PS D:\github_repos\javapractice\25_arrays> java E
null null null 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter name: raja
Enter age: 10
Enter name: baja
Enter age: 16
Enter name: taja
Enter age: 13
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
raja - 10
baja - 16
taja - 13
 */