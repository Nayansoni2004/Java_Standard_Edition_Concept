class S {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();

        Animal[] x = {a1, a2, a3}; //assigning same class Animal type objects.

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/*OUTPUT
Animal@85ede7b
Animal@5674cd4d
Animal@63961c42
 */