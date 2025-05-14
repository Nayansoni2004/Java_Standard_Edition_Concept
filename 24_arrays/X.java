class X {
    public static void main(String[] args) { //here array is passed whatever logic the method has..
        // System.out.println(args);
        System.out.println(args.length);
    }
}
/* no command line argument...
OUTPUT
Java always treats command-line arguments as a String[] array, Even if you pass nothing, the array is still created — just empty.

PS D:\github_repos\javapractice\24_arrays> javac X.java
PS D:\github_repos\javapractice\24_arrays> java X
[Ljava.lang.String;@3a71f4dd <- array object ref. code##############################
PS D:\github_repos\javapractice\24_arrays> javac X.java
PS D:\github_repos\javapractice\24_arrays> java X
0 <- array is created which has 0 size bec. no argument is passed during compile time from the terminal############
 */