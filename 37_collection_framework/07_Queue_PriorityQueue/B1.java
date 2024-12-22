import java.util.PriorityQueue;
class B1 {
    //main method
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer(23);
        pq.offer(41);
        pq.offer(19);
        pq.offer(4);
        pq.offer(34);
        pq.offer(19); //duplicate records are allowed.

       // System.out.println(pq);

       int size = pq.size();
       for(int i = 0 ; i < size ; i++) {
        System.out.println(pq.poll());
       } 
    }
}
/*OUTPUT: sorted way m nhi aaya jubki PriorityQueue sorted collection class h,isley poll()<-method ka use krna h.
[4, 19, 19, 56, 23, 41, 34]<-duplicate records are allowed.
 */
/*OUTPUT: loop ka use kr k PriorityQueue m se record poll/remove kiye.
4
19
19
23
34
41
56 */