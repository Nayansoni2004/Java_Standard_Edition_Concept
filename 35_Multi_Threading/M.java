class M {
    //main method
    public static void main(String[] args) {
        boolean flag = Thread.currentThread().isAlive();

        System.out.println(flag);
    }
}
//OUTPUT: true 
//true aaya kyuki default Thread jinda h. or isAlive method yahi batati h ki Thread zinda h ya nhi.