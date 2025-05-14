class W {
    public static void main(String[] args) {
        // super shortcut technique of 2d array declaration cum instantiation cum initialization on single line..
        String[][] y = {{"a", "b"}, {"c", "d", "e", "f", "g"}, {"h", "i", "j"}};//size of 2d array is 3 and inner(1d arrays have different sizes..)

        // enhanced for loop for-each loop
        for(String[] i : y) {
            for(String k : i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
/* created 2d array using super shortcut technique of type String which has length: 3 and inner 1d arrays have
   different lengths & also accessed and printed elements of 1d array objects using enhanced for-loop(for-each)loop.
OUTPUT
a b 
c d e f g
h i j
 */