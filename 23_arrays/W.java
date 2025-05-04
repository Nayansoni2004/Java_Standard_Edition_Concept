class W {
    public static void main(String[] args) {
        Dog d = new BDog();

        Animal x = d; //no explicit conversion needed because Dog is subtype of Animal.

        System.out.println(d);
        System.out.println(x);
    }
}
/* BDog object ref. code is printed because Dog is ref. var. but Object is of type BDog(sub-class)type.
OUTPUT
BDog@63961c42
BDog@63961c42
 */