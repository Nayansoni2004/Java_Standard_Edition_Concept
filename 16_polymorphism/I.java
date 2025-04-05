class I {
    public static void main(String[] args) {
        Object x = new Bus();

        if(x instanceof SportsCar) {
            System.out.println("Bus IS-A SportsCar");
        } else {
            System.out.println("Bus IS-not-A SportsCar");
        }
    }
}
/*
Tested unrelated classes with instanceof: Bus IS-not-A SportsCar as there's no inheritance relationship between them.

D:\github_repos\javapractice\16_polymorphism> java I
Bus IS-not-A SportsCar
 */