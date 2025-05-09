class G {
    public static void main(String[] args) {
        Animal[] x = new Dog[2]; //in ref. type (sub-type or same type) can be assigned into an array. 

        x[0] = new Dog();
        x[1] = new Cat();

        System.out.println(x);
    }
}

/* Exception at runtime :
Exception in thread "main" java.lang.ArrayStoreException: Cat
        at G.main(G.java:6)
 */