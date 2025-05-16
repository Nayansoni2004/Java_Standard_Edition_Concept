import java.util.Scanner;

class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int m = sc.nextInt();
        int n = sc.nextInt();


        System.out.println("numbers are : " + m + ", " + n);
        sc.close();
    }    
}
/*
This code demonstrates input behavior of Scanner's nextInt():

Case 1:
If you enter the first number and press Enter (e.g., input: 2⏎), 
then type the second number (e.g., 4⏎), the second number is still 
correctly read. This is because nextInt() waits for the next valid int input.

Case 2:
If you enter both numbers in one line with space in between (e.g., 2 4⏎),
then both inputs are consumed immediately — no extra newline remains.

So, whether you enter numbers line-by-line or in one line with space, 
the output remains the same.

Example Output:

> java D1
Enter two numbers: 2
4
Numbers are: 2, 4

> java D1
Enter two numbers: 2 4
Numbers are: 2, 4
*/
