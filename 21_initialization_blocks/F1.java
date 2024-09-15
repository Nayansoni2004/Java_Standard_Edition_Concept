class F1 {
    //instance-level initialization blocks
    {
        System.out.println("G");
    }

    {
        System.out.println("5");
    }

    F1() {
        //super();
        //inst. init. blocks
        System.out.println("J");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Y");
        F1 x = new F1();
        System.out.println("T");
    }

    {
        System.out.println("K");
    }
}
/* OUTPUT:
Y
G
5
K
J
T
instance-level initialization block constructor ka super();call end hote hi,turant automatic us instance pr jo
ban rha hota h,us pr run ho jate h or upar se niche ki ore specific order m run hote h,then constructor ka
code jo humne likha h wo at tha last run hota h.*/