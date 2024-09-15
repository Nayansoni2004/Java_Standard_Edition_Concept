class E {
    //Static Initialization Blocks
    //Try to re-order the Init. blocks

    static {
        System.out.println(7);
    }

    static {
        System.out.println(2);
    }
    //main method
    public static void main(String[] args) {

    }

    static {
        System.out.println(5);
    }
}
/* OUTPUT: 
7
2
5
static initialization block ho ya instance-level initialization block,run to dono hi order m hote h upar se niche
ki ore,static initialization block jaise hi class load hota h turant classObject pr automatic run ho jate h.*/