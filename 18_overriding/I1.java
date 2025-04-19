class A2 {
    final void pro() {
        System.out.println("HI");
    }
}

class B2 extends A2 {
    // you can't redefine the final method in subclss...
    void pro() {
        System.out.println("HELLO");
    }
}
/*compilation error...
D:\github_repos\javapractice\18_overriding> javac I1.java
I1.java:9: error: pro() in B2 cannot override pro() in A2
    void pro() {
         ^
  overridden method is final
1 error

note: final methods can not be over-ridden bec. they are marked final so that any subclass can not redefine its 
      behaviour, insuring security. 
 */