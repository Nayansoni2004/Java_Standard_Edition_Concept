class A {
    //main method...
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.u);
    }
}

class B {
    int u = 34;
}
//now making B class in B.java file in next example and let's see which class will compiler access.
//OUTPUT:34
//34 aya kyuki pahle compiler A.java k andar dekhega ki B name se Koi class h kya
//agar h to usko access kr lega nhi to B.java k andar dhekhega agar B.java k andar v
//nhi h to check krega ki pahle se koi B.class file rakhi h kya agar h to us B.class 
//file ko access kr lega. 