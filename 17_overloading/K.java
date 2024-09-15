class K {
    //main method... 
    public static void main(String[] args) {
        Bathua x = new Bathua();
        prepareBathua(x);

        Cholai y = new Cholai();
        prepareCholai(y);

        Norpa z = new Norpa();
        prepareNorpa(z);
        //prepareNorpa(x);->error:Bathua cannot be converted to Norpa!!
    } 
                //parameter type mis-match.
    static void prepareBathua(Bathua x) {
        System.out.println("------Bathua-----start---");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
    }
                //parameter type mis-match.
    static void prepareCholai(Cholai y) {
        System.out.println("------Cholai----start-----");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
    }
                 //parameter type mis-match.
    static void prepareNorpa(Norpa z) {
        System.out.println("------Norpa-----start-----");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
        System.out.println("step-5");
    }   
}
/*  happily compiled and runned....
lekin K.java example m Cholai banane k liye Cholai k hi method m Cholai ka hi var. call krna pad rha h,or agar
Bathua ka method call krna h to prepareBathua method m usi class type ka var. pass krna pad rha h,or agar Norpa
ka method run krna h to prepareNorpa m Norpa type ka hi var. pass krna pad rha h,lekin is process m har method
ko alag alag call krna pad rha h,,isley hum prepareLeafyVegetable name se same method teeno Bathua,Cholai,Norpa
m bana denge,lekin parameter body mis-match rakhenge,to teeno ka object banane k baad jub prepareLeafyVegetable
m Bathua type ka var. pass krenge to Bathua ka method run hoga,or jub Cholai type ka var. pass krenge to Cholai
ka method run hoga,or jub Norpa type ka var. pass krnege to Norpa ka method run hoga,,matlab prepareLeafyVegetabel
m jis bhi class type ka var. hoga usi ka method run hoga,to hum kewal prepareLeafyVegetable se teeno method ko 
run kr sakte h,or ye run krna L.java m dekhenge....
*/