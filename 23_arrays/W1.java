class W1 {
    public static void main(String[] args) {
        Animal[] x = new BDog[2]; //one reference type array(sub-type) can be assigned into another reference type array(parent-type).

        System.out.println(x);
    }
}
/* array object is of type BDog that's why printing object ref. code prints the ref. code of what is assigned into
   a ref. variable.
OUTPUT
[LBDog;@3a71f4dd
 */