class Y {
    public static void main(String[] args) {
        System.out.println(args.length); //length is a property in array, not a method!
    }
}

// /> java Y mohan ram kushal <enter>

/*
accessed and printed length of main method argument var.(args) & also passed String arguments on cmd line window
OUTPUT
PS D:\github_repos\javapractice\24_arrays> javac Y.java
PS D:\github_repos\javapractice\24_arrays> java Y
0 <- when no cmd line argument is passed#####################
PS D:\github_repos\javapractice\24_arrays> java Y mohan ram kushal
3 <- when cmd line arguments are passed######################
 */