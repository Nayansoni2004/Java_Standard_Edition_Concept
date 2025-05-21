import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        String[] names = new String[n];

        sc.nextLine(); //this reads the next line that is \n from buffer which was left after pressing the enter key...mandatory line

        for(int i = 0 ; i < n ; i++) {
            System.out.print("Enter name: ");

            names[i] = sc.nextLine(); //this reads the next "name" that is next input string from user
        }

        System.out.println("##################################");

        //printing the elements of names array using enhanced for loop(for-each loop)
        for(String name : names) {
            System.out.println(name);
        }
        
    }
}

/* took a number as an input from user and created a array of type string whose size is that user input value 'n'
   and stored the user input strings in names array and later printed elements of an array names
OUTPUT
PS D:\github_repos\javapractice\25_arrays> java D
Enter a number: 3
Enter name: raju
Enter name: rancho
Enter name: farhan
##################################
raju
rancho
farhan
 */
