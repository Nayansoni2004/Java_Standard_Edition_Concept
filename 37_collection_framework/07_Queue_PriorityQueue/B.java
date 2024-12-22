import java.util.PriorityQueue;
class B {
    //main method
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer(23);
        pq.offer(41);
        pq.offer(19);
        pq.offer(4);
        
       // System.out.println(pq);

       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
    }
}
/*OUTPUT:
[4, 19, 41, 56, 23] <-PriorityQueue k case m obj. ref. var. ko direct print krne pr sorted way m output nhi ata
                      jub ki PriorityQueue sorted collection class h,isley poll()<-method ka use krna padta h
                      ye method hume sorted way m ouput deti h kyuki ye head of the Queue remove krti h har bar.
 */
/*OUTPUT: sorted way m aaya,kyuki poll()method ka use kia h.
4
19
23
41
56 */