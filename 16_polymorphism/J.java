class J {
    public static void main(String[] args) {
        Vehicle x = new Bus();

        if(x instanceof Car) {
            System.out.println("Bus IS-A Car");
        }
        else {
            System.out.println("Bus IS-not-A Car");
        }
    }
}
/*
Reason it prints "Bus IS-not-A Car":
Bus and Car are siblings — they both extend Vehicle, but neither inherits from the other.

Since Bus does not extend Car, there's no IS-A relationship between them.

So, instanceof returns false.

D:\github_repos\javapractice\16_polymorphism> java J
Bus IS-not-A Car
 */