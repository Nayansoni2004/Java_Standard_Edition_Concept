class H3 {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof Car) {
            System.out.println("SportsCar IS-A Car");
        } else {
            System.out.println("SportsCar IS-not-A Car");
        }
    }
}
/*
Demonstrated polymorphism using instanceof to verify IS-A relationship: SportsCar is a child of Car

D:\github_repos\javapractice\16_polymorphism> java H3
SportsCar IS-A Car
 */