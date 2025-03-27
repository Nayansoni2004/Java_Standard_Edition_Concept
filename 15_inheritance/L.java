// Cyclic Inheritance

class W extends L {

}

class L extends W {

}

/*
Note: Cyclic Inheritance is not allowed.

D:\github_repos\javapractice\15_inheritance> javac L.java
L.java:3: error: cyclic inheritance involving W
class W extends L {
^
1 error
 */