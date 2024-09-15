//METHOD OVERLOADING......but it's not a overloading bec. methods have different names.
class M {
    //main method.
    public static void main(String[] args) {
        Water water = new Water();
        Sugar sugar = new Sugar();
        Milk milk = new Milk();
        TeaLeaves tealeaves = new TeaLeaves();
        Herb herb = new Herb();
        //methods call....
        prepMilkTea(milk, tealeaves, water, sugar);
        prepHerbTea(herb, tealeaves, water, sugar);
        prepBlackTea(tealeaves, water, sugar);
    }
                            //parameter body mis-matched!!!
    static void prepMilkTea(Milk milk,TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("--------prepMilkTea----------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
    }

    static void prepBlackTea(TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("--------prepBlackTea----------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-4");
    }
                           //herb class type ka var. h!!!
    static void prepHerbTea(Herb herb,TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("-----------prepHerbTea------------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-4");
        System.out.println("step-5");
    }
}
/* happily compiled and runned.....but har 1 method ko alag-alag call krna pada...kyuki sari tea banane ki methods
k name different h,lekin bana to tea hi rhe h,to sari methods ko alag-alag name dene se aacha same name de do
prepTea,but parameters must mis-match hona chahiye sari tea banane ki methods k or jub bhi prepTea method ko
call kia jayega to compiler ye dekhega ki var. ka type kya h,kya var. class type ka h?,to jis bhi class ka var.
hoga us class ka method run hoga,aisa krne se 1 hi call statement m sari methods ko call kr sakte h...
ye hum M1.java example m dekhenge.  */