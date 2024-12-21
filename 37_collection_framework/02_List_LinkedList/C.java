import java.util.LinkedList;
class C {
    //main method
    public static void main(String[] args) {
        //LinkedList as a Queue...
        LinkedList x = new LinkedList();
        //QUEUE Interface ki method h offer()<-return type boolean,which works as a add() method.
        x.offer(34);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 0-index pe store hoga. 
        x.offer(56);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 1-index pe store hoga.
        x.offer(78);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 2-index pe store hoga.
        x.offer(12);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 3-index pe store hoga.
        x.offer(8);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 4-index pe store hoga.

        System.out.println(x);//print hone se pahle,internally Object class ki toString() call hogi,or String return kregi.
//QUEUE Interface ki method h poll()<-return type <E>Element,which works as a remove()method but,poll() removes the first element from the head.
        System.out.println(x.poll()); 
        System.out.println(x.poll()); //re-indexing is done when any element is offer or poll(from an existing LinkedList).
        System.out.println(x.poll()); //poll()method removes/retrieves the first element from the head.
        System.out.println(x.poll());
        System.out.println(x.poll());

        System.out.println(x);//internally Object class ki toString() call nhi hogi kyuki no record is left in LinkeList.
    }
}
/*OUTPUT:
[34, 56, 78, 12, 8]
34
56
78
12
8
[] */