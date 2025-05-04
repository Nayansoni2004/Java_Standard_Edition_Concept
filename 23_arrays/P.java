class P {
    public static void main(String[] args) {
        String[] x = {"om", "ram", "shyam", "khatushyam"};

        //reading arrays records in backward direction - login 1
        for(int i = x.length-1 ; i >= 0 ; i--) {
            System.out.println(x[i]);
        }

        System.out.println("##############################");

        //reading arrays records in backward direction - login 2
        for(int i = 0 ; i < x.length ; i++) {
            System.out.println(x[x.length - i - 1]);
        }
    }
}
/* using forloop array records can be read either in backward or forward direction.
OUTPUT:
khatushyam
shyam
ram
om
##############################
khatushyam
shyam
ram
om
 */