class M {

    static int x = 20;

    //main method banayenge...
    public static void main(String[] args) {
        M m1 = new M();
        m1.x = 3;
        M m2 = new M();
        m2.x = 6;

        System.out.println(m1.x);
    }
}
//D:\javaprac\4_context>java M
//6