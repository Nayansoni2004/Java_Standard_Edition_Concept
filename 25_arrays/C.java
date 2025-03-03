class C {
    public static void main(String[] args) {
        System.out.println(args[0] instanceof String);
        System.out.println(args[1] instanceof String);
        System.out.println(args[2] instanceof String);
        System.out.println(args[3] instanceof String);

        System.err.println("_____________________________________________");

        System.out.println(args[0]);
        System.out.println(args[1] + 1);
        System.out.println(args[2] + 1);
        System.out.println(args[3]);
    }
}

//i/p: />java C mohan 23 78.45 true

/*
PS D:\github_repos\javapractice\25_arrays> java C <-when no cmd argument is passed to program#################
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at C.main(C.java:3)
PS D:\github_repos\javapractice\25_arrays> java C mohan 23 78.45 true
true
true
true
true
_____________________________________________
mohan
231
78.451
true
 */