class F {
    //instance-level initialization block
    {
        System.out.println("G");
    }

    {
        System.out.println("5");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Y");

        F x = new F();
        System.out.println("T");
    }

    {
        System.out.println("K");
    }
}
/*OUTPUT: 
Y
G
5
K
T
instance initialization block upar se niche ki ore order m constructor ka super();call complete hote hi,jo
instance ban rha hota h,us instance pr automatic run ho jate h.  */