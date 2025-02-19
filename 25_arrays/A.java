class A {
    public static void main(String[] args) { //main method in java treats every input as an array, passed from cmd window.

        for(String x : args) { //args = ["33", "22", "77"] — all elements are Strings.
            System.out.println(x + 1); //Here, x + 1 is string concatenation, not arithmetic addition.
        }

    }
}
/*
OUTPUT
PS D:\github_repos\javapractice\25_arrays> javac A.java
PS D:\github_repos\javapractice\25_arrays> java A <-when no cmd line arguments is passed so loop doest enter#######################
PS D:\github_repos\javapractice\25_arrays> java A 33 22 77 <-when cmd line argument is passed####################
331
221
771
 */