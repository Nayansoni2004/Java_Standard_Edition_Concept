import java.util.PriorityQueue;
class D {
    //main method
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(new Student("kartik" , 18));
        pq.offer(new Student("simha" , 9));
        pq.offer(new Student("vijendra" , 12));
        pq.offer(new Student("prasad" , 5));
        pq.offer(new Student("ganesh" , 10));
        pq.offer(new Student("vijendra" , 12));

        //System.out.println(pq);
        int size = pq.size();
        for(int i = 0 ; i < size ; i++) {
            System.out.println(pq.poll());//<-removes the first element from head,returnType <E>Element.
        }
    }
}
class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " * " + age;
    }

    public int compareTo(Student obj) {
        String nm1 = this.name;
        String nm2 = obj.name;

        return nm1.compareTo(nm2);
    }
}
/*OUTPUT: sorted way m nhi aaya output kyuki direct obj. ref. var. ko print kia h.
[ganesh * 10, kartik * 18, vijendra * 12, simha * 9, prasad * 5, vijendra * 12] */

/*OUTPUT: poll()<-method call krne pr output sorted way m aaya.
ganesh * 10
kartik * 18
prasad * 5
simha * 9
vijendra * 12
vijendra * 12 */