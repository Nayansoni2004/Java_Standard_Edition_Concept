class Y {
    public static void main(String[] args) {
        int[] x = {12, 13, 14, 32, 21, 18, 17, 19, 20};

        int max = x[0];

        for(int i = 0 ; i < x.length ; i++) {
            // System.out.println("i(index):" + i + " - " + "x["+ i + "]: " + x[i]);

            if(x[i] > max) max = x[i];
        }

        System.out.println(max);
    }
}
/* printed max. value of an array.
OUTPUT
32
 */