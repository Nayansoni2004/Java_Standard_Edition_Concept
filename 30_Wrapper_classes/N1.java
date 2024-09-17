class N1 {
    //main method
    public static void main(String[] args) {
        Character b1 = 128;
        Character b2 = 128;

        System.out.println(b1 == b2);
    }
}
/*OUTPUT:false
false aaya kyuki value out of range ho gyi,primitive byte ki range -128 to 127 hoti h or chote bartan ko bade 
bartan m assign kr sakte h but 128 likhne se byte ki range k bahar ho gya isley false aaya.
*/