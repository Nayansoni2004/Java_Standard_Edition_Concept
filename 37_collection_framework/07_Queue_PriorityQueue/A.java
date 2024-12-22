import java.util.PriorityQueue;
class A {
    //main method
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer("jay");
        pq.offer("mohan");
        pq.offer("bablu");
        pq.offer("rohan");
        pq.offer("ganesh");
        pq.offer("vijendravikram");

       // System.out.println(pq);

       System.out.println(pq.poll());//<-removes the first element from head,returnType->Element.
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
    }
}
/*OUTPUT: bina poll() method call kiye output...
[bablu, ganesh, jay, rohan, mohan, vijendravikram] <-PriorityQueue ik sorted collection class h,lekin fir bhi 
                                                     output sorted way m nhi aaya,kyuki PriorityQueue m direct
                                                     obj. ref. var. ko print krne se sorted records nhi milte,
                                                     isley poll()method ka use krna padta h taki sorted way m 
                                                     output mile. */

/*OUTPUT: sorted way m mila is baar kyuki poll() method call kia h.
bablu
ganesh
jay
mohan
rohan
vijendravikram */                                                     
