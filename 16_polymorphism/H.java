class H {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof Object) {
            System.out.println("SportsCar IS-A Object");
        } else {
            System.out.println("SportsCar IS-not-A Object");
        }
    }
}
/*
D:\github_repos\javapractice\16_polymorphism> java H
SportsCar IS-A Object
 */