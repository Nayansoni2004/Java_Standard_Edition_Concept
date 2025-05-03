class O1 {
    public static void main(String[] args) {
        //super shortcut technique of array declaration cum instantiation cum initialization....
        String[] x = {"prayank", "anshul", "jay", "himanshu", "drishti", "eesha", "khushi", "himanshi"};

        for(int i = 0 ; i < x.length; i++) {
            System.out.println(i + " - " + x[i]);
        }
    }
}
/*
OUTPUT:
PS D:\github_repos\javapractice\23_arrays> java O1
0 - prayank
1 - anshul
2 - jay
3 - himanshu
4 - drishti
5 - eesha
6 - khushi
7 - himanshi
 */