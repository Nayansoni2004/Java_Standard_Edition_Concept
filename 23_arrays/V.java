class V {
    public static void main(String[] args) {
        byte b = 9;
        int i = b; //byte will be converted to int while compiling by the compiler implicitly.

        System.out.println(b);
        System.out.println(i);
    }
}
/* OUTPUT
PS D:\github_repos\javapractice\23_arrays> java V
9
9
 */