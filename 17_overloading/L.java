class L {
    //main method.
    public static void main(String[] args) {
        Bathua x = new Bathua();
        //prepareLeafyVegetable(x);

        Cholai y = new Cholai();
        //prepareLeafyVegetable(y);

        Norpa z = new Norpa();
        //prepareLeafyVegetable(z);
        prepareLeafyVegetable(z);
        prepareLeafyVegetable(x);
        prepareLeafyVegetable(y);
    }
                      //parameter type mis-match.
    //static void prepareBathua(Bathua x) {
    static void prepareLeafyVegetable(Bathua x) {
        System.out.println("--------Bathua-----start------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
    }
                       //parameter type mis-match.
    //static void prepareCholai(Cholai y) {
    static void prepareLeafyVegetable(Cholai y) {
        System.out.println("----------Cholai------start------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
    }
                         //parameter type mis-match.
    //static void prepareNorpa(Norpa z) {
    static void prepareLeafyVegetable(Norpa z) {
        System.out.println("--------Norpa--------start-------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
        System.out.println("step-5");
    }
}
/*  happily compiled and runned....
(prepareBathua,prepareCholai,prepareNorpa) teeno bhaji ko banane ki alag-alag method h,or kisi 1 method ko run 
krne k liye usi method ka var. pass krna pad rha tha,isley teeno method ko same name se bna dia
(prepareLeafyVegetable)or teeno method k parameter mis-match rakhe,to jub Bathua type ka var. prepareLeafyVegetable
me call krenge to Bathua ka method run hoga,or jub prepareLeafyVegetable me Cholai type ka var. call krenge tab
Cholai ka method run hoga,or agar prepareLeafyVegetable method m Norpa type ka var. call krnge to Norpa ka 
method run hoga,matlab jub teeno Norpa,Bathua,Cholai k object bana lenge to tab jis bhi class ka var. 
prepareLeafyVegetable method m call krenge,usi class ka method run hoga.or K.java m alag alag method bana k call
krna pad rha tha ,isley L.java m prepareLeafyVegetable name se hi teeno method banaye or ab jis bhi class type ka
var. call krenge usi ka method run hoga.
*/