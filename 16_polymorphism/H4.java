class H4 {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof SportsCar) {
            System.out.println("SportsCar IS-A SportsCar");
        } else {
            System.out.println("SportsCar IS-not-A SportsCar");
        }
    }
}
/*
Used instanceof to confirm object type: SportsCar IS-A SportsCar, demonstrating polymorphism with inheritance from Car

D:\github_repos\javapractice\16_polymorphism> java H4
SportsCar IS-A SportsCar
 */