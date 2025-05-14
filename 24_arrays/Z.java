class Z {
    public static void main(String[] args) {
        //enhanced for loop (for-each)loop
        for(String x : args) {
            System.out.print(x + " ");
        }

    }
}

// /> java Z mohan 23 78.89

/* 
args is never null — Java automatically creates an empty array (new String[0]) if no command-line arguments are passed.
An enhanced for loop (for-each) handles empty arrays gracefully — it simply doesn’t execute the loop body.

OUTPUT
PS D:\github_repos\javapractice\24_arrays> javac Z.java
PS D:\github_repos\javapractice\24_arrays> java Z <-when no cmd line argument is passed######################
PS D:\github_repos\javapractice\24_arrays> java Z mohan 23 89.67 
mohan 23 89.67 <-when cmd line arguments are passed##########
 */