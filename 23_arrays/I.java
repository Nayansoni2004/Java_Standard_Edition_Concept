class I {
    //main method...
    public static void main(String[] args) {
        Teacher[] x = new Teacher[3];

        x[0] = new Teacher("Ganesh", 15);
        x[1] = new Teacher("samaksh", 32);
        x[2] = new Teacher("vigyan", 23);

        System.out.println(x);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/* OUTPUT: happily coompiled...or Teacher.java(sourcefile) bhi access ho gyi...
[LTeacher;@36baf30c  <-ref. code entire array object ref. var. x ka print hua...
Ganesh - 15
samaksh - 32
vigyan - 23
*/