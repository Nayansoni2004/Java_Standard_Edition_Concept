import java.util.LinkedList;
class D {
    //main method
    public static void main(String[] args) {
        //LinkedList as a Queue...
        LinkedList x = new LinkedList();

        x.offer(34);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 0-index pe store hoga.
        x.offer(56);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 1-index pe store hoga.
        x.offer(78);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 2-index pe store hoga.
        x.offer(12);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 3-index pe store hoga.
        x.offer(8);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 4-index pe store hoga.

        System.out.println(x);//internally Object class ki toString()method call hogi or string value return kregi,obj. ki.

        System.out.println(x.peek()); 
        System.out.println(x.peek());
        System.out.println(x.peek());//this method works as a get() method,& only retrieves element & does'nt remove.
        System.out.println(x.peek());//peek()<-return type <E>Element & returns the head element of Queue.
        System.out.println(x.peek());//jitne bar v peek() call kr lo kewal head of Queue hi return krti h.

        System.out.println(x);//internally Object class ki toString()method call hogi or string value return kregi,obj. ki.
    }
}
/*OUTPUT:
[34, 56, 78, 12, 8]
34
34
34
34
34
[34, 56, 78, 12, 8] */