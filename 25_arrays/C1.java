class C1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]); //conversion of String into specific datatype from array, cmd line argument
        float marks = Float.parseFloat(args[2]);
        boolean flag = Boolean.parseBoolean(args[3]);

        System.out.println(args[0]);
        System.out.println(age + 1);
        System.out.println(marks + 1);
        System.out.println(flag);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(args[3]);
    }
}
// i/p: />java C1 mohan 22 34.45 true
/*
PS D:\github_repos\javapractice\25_arrays> java C1 <-when no cmd line argument is passed to java program#################
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0
        at C1.main(C1.java:3)
PS D:\github_repos\javapractice\25_arrays> java C1 mohan 22 34.45 true
mohan
23
35.45
true
~~~~~~~~~~~~~~~~~~~~~~~~
true
 */