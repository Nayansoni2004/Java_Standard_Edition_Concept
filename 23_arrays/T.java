class T {
    public static void main(String[] args) {
        LivingBeing lb = new BDog();

        Animal anm = lb; //explicit narrowing conversion krna padega for animal conversion.
    }
}
/*
T.java:5: error: incompatible types: LivingBeing cannot be converted to Animal
        Animal anm = lb; //explicit narrowing conversion krna padega for animal conversion.
                     ^
1 error
 */