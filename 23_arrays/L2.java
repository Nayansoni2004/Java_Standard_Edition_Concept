class L2 {
    public static void main(String[] args) {
        int[] x = {22, 33}; //super shortcut technique: Array declaration cum instantiation cum initialization.

        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}
/* In this code, array instantiation is implicitly done by the compiler, not explicitly by programmer.
   use the command : javap -c L2 to see the bytecode of the code that compiler does instantiation or not.
   or for the detailed info use command: javap -v L2 -> this also shows the bytecode of the code.

OUTPUT:
PS D:\github_repos\javapractice\23_arrays> java L2
22
33
 */