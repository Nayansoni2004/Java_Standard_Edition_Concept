class R {
    public static void main(String[] args) {
        char c = 'B';
        byte b = 20;
        short s = 60;
        int i = 70;

        // int[] x = {12, 14, 16, 18};

        int[] x = {c, b, s, i}; //all values implicitly converted into int before assiging into array by the compiler

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
    }
}
/*
assigning lower datatype variables (char, byte, short, int) into int (standard integer datatype) which is an array
so implicit widening conversion is done by compiler.
OUTPUT
66
20
60
70
 */