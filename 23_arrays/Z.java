class Z {
    public static void main(String[] args) {
        int[] x = {12, 13, 14, 32, 21, 18, 17, 19, 20};
        
        int min = x[0];

        for(int i = 0 ; i < x.length ; i++) {
            if(x[i] < min) min = x[i];
        }

        System.out.println(min);
    }
}
/* printed minimum element of an array.
OUTPUT
12
 */