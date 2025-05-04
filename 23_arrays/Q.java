class Q {
    public static void main(String[] args) {
        char c = 'A';
        byte b = 2;
        short s = 4;
        int i = 7;

        int x;

        x = c; //widening conversion of datatype
        System.out.println(x);

        x = b;
        System.out.println(x);

        x = s;
        System.out.println(x);

        x = i;
        System.out.println(x);
    }  
}
/*implicit widening conversion of lower datatypes(char, byte, short) into int(standard integer type) by the compiler.
 OUTPUT
PS D:\github_repos\javapractice\23_arrays> java Q
65
2
4
7
 */