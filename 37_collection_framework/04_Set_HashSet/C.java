import java.util.HashSet;
class C {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set);

        set.add(56); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(12); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(68); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(56); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(21); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(19); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.
        set.add(56); //internally,auto-boxing hogi,Integer obj. banega or ordering(indexing)nhi hogi.

        System.out.println(set);
    }
}
/*OUTPUT: Duplicate records are not allowed in Set Interface isley 56 ik bar hi print hua.
[]
[19, 68, 21, 56, 12] */