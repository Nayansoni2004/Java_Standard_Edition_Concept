//Cyclic Inheritance 

class M extends M {

}

/*
Cyclic Inheritance is not allowed.

D:\github_repos\javapractice\15_inheritance> javac M.java
M.java:3: error: cyclic inheritance involving M
class M extends M {
^
1 error
 */