class K {
    public static void main(String[] args) {
        Car x = new SportsCar();

        if(x instanceof Bus) {
            System.out.println("SportsCar IS-A Bus");
        } else {
            System.out.println("SportsCar IS-not-A Bus");
        }
    }
}
/* compilation failed---code did not go for the runtime...
D:\github_repos\javapractice\16_polymorphism> javac K.java
K.java:5: error: incompatible types: Car cannot be converted to Bus
        if(x instanceof Bus) {
           ^
1 error
 */

 /*
Car and Bus are unrelated classes (they don’t share an inheritance relationship).

Java does compile-time checking for instanceof. If it knows the object (or reference type) can never be a Bus, it gives an incompatible types error at compile-time.
  */