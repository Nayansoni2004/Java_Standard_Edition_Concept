class K {
    public static void main(String[] args) {
        boolean[] b = new boolean[3];
        char[] c = new char[3];
        byte[] t = new byte[3];
        short[] s = new short[3];
        int[] i = new int[3];
        long[] l = new long[3];
        float[] f = new float[3];
        double[] d = new double[3];
        String[] y = new String[3];
        Student[] x = new Student[4]; //This class resolves its exists in H.java

        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(y);
        System.out.println(x);

        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'V';

        System.out.println(c);
    }
}
/* 
output gives gap in second line while printing array of char object's ref. code because when we print the ref. code
of char array object then it implicitly prints elements inside it but, in line second it is not initialized and getting
print so it prints space and after initializing char array and printing the ref. code print its elements.

OUTPUT
PS D:\github_repos\javapractice\23_arrays> java K
[Z@3a71f4dd

[B@7adf9f5f
[S@85ede7b
[I@5674cd4d
[J@63961c42
[F@65b54208
[D@1be6f5c3
[Ljava.lang.String;@6b884d57
[LStudent;@38af3868
ABV
 */