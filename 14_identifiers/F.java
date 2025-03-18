class F {
    int a = 10;
    int a = 12;
}

/*
Explored Java identifier limitations by testing reserved keywords and duplicate declarations.

D:\github_repos\javapractice\14_identifiers> javac F.java
F.java:3: error: variable a is already defined in class F
    int a = 12;
        ^
1 error
 */