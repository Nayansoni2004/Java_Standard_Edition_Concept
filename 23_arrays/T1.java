class T1 {
    public static void main(String[] args) {
        LivingBeing lb = new BDog();

        Animal anm = (Animal)lb; //explicit conversion from LivingBeing to Animal bec. Animal is sub-type of LivingBeing

        System.out.println(anm + " @@@@@@@@@@@@@");
    }
}
/* BDog object ref. code got print bec. ref. code is of LivingBeing but object is of BDog and after conversion of 
   LivingBeing the ref. code is of Animal but still object is of type BDog.
OUTPUT
BDog@3e3abc88 @@@@@@@@@@@@@
 */