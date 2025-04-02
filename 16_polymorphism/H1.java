class H1 {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof Vehicle) {
            System.out.println("SportsCar IS-A Vehicle");
        } else {
            System.out.println("SportsCar IS-not-A Vehicle");
        }
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> java H1
SportsCar IS-A Vehicle
 */