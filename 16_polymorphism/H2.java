class H2 {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof FourWheeler) {
            System.out.println("SportsCar IS-A FourWheeler");
        } else {
            System.out.println("SportsCar IS-not-A FourWheeler");
        }
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> java H2
SportsCar IS-A FourWheeler
 */