class M3 {

    final int i;

    void pro() {
        i = 8;
    }
}
/*
M3.java:6: error: cannot assign a value to final variable i
        i = 8;
        ^
1 error

CONCLUSION: it's tooo late to assign a value to a final variable i.
            method k andar final var. ko initialize krna bohot late ho jayega isley error aai,kyuki code line by 
            line execution hota h. to declaration pahle kr dia or initialization method k andar kr rhe h ,jo ki 
            legal nhi h.
*/