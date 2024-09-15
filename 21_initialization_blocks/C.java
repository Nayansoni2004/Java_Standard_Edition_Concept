class C {
    //instance-level(non-static) Initialization blocks

    //Try to re-order the initialization blocks...

    {
        System.out.println("G");
    }

    {
        System.out.println("5");
    }
    //main method
    public static void main(String[] args) {
        C x = new C();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        C y = new C();
    }

    {
        System.out.println("K");
    }
}
/* OUTPUT:
G
5
K
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
G
5
K
instance level-initialization blocks jese hi constructor ka super();call complete hota h,just turant instance-
level initialization blocks order m upar se niche ki ore run hote h,then constructor ka bacha khucha code 
run hota h,or jitni bar object bana k constructor call krte h utni bar instance-level initialization blocks 
upar se niche ki ore run hote h.
*/