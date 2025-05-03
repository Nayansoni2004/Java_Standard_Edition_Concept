class N {
    public static void main(String[] args) {
        float[] x = {0.2f, 0.3f, 0.4f}; //super shortcut technique to declare, instantiate & initialize an array.

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    } 
}
/*
In this code the float array is instantiated using new keyword implicitely by the compiler.
for more info:- run command javap -c N or javap -v N (for detailed info).
OUTPUT
PS D:\github_repos\javapractice\23_arrays> java N
0.2
0.3
0.4
 */