//LEGAL METHOD OVERLOADING!!!   it's a overloading bec. multiple methods have same name,but witheach parameter body mis-matched.
class M1 {
    //main method...
    public static void main(String[] args) {
        Water water = new Water();
        Sugar sugar = new Sugar();
        TeaLeaves tealeaves = new TeaLeaves();
        Herb herb = new Herb();
        Milk milk = new Milk();
    //methods call...
    prepTea(tealeaves, water, sugar);//run one at a time....kyuki kisi 1 method ko hi 1 time pr execute kroge!!!
    prepTea(herb, tealeaves, water, sugar);
    prepTea(milk, tealeaves, water, sugar);
    }
//multiple methods with same name but with different parameters!!!
    static void prepTea(Milk milk,TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("---------prepMilkTea--------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-3");
        System.out.println("step-4");
    }
                       //parameter count mis-matched!!!
    static void prepTea(TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("----------prepBlackTea------------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-4");
    }

    static void prepTea(Herb herb,TeaLeaves tealeaves,Water water,Sugar sugar) {
        System.out.println("------------prepHerbTea------------");
        System.out.println("step-1");
        System.out.println("step-2");
        System.out.println("step-4");
        System.out.println("step-5");
    }
}
/*happily compiled and runned.....or isme 1 hi statement se jis class type ka var. call krenge us class ka method
run hoga,har 1 method ko alag-alag call nhi krna pada,1 hi method call m jis class type ka var. pass krenge us 
class k jese behave krne lagega,matlab us class ka method run hoga.
*/
