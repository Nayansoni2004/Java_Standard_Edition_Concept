class L {
    static int s = 999;

    //main method...
    public static void main(String[] args) {
        L l = new L();

        //<obj.ref.var.>.<static-member>
        //l.s => L.s 
        System.out.println(l.s);
    }
}

//output:...
//999