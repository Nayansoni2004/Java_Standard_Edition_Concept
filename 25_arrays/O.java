// task 1: read the elements of 2d array x and store into 2d array y in the same corresponding indexes.
public class O {
    public static void main(String[] args) {
        int[][] x = {{2, 9, 7, 3, 4}, {5, 8, 11}, {3, 5}, {8}};//super short-cut technique

        int[][] y = new int[x.length][];//created array y of same length

        //printing 1d array elements of 2d array x
        for(int[] OneDArr : x) {
            for(int element : OneDArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //printing 1d array objects of array y
        for(int[] OneDArr : y) {
            System.out.print(OneDArr + " ");
        }

        System.out.println();

        //logic to copy x array in y array
        for(int i = 0 ; i < x.length ; i++) {
            y[i] = new int[x[i].length]; //creating array objects in y array
            for(int j = 0 ; j < x[i].length ; j++) {
                y[i][j] = x[i][j]; //copying elements in each 1d array objects
            }
        }

        //again printing elements of array y
        for(int[] OneDArr : y) {
            for(int element : OneDArr) {
                System.out.print(element + " ");
            }
            System.out.println(); //gives the new line
        }

    }   
}
/*OUTPUT
2 9 7 3 4 
5 8 11 
3 5 
8
null null null null
2 9 7 3 4
5 8 11
3 5
8
 */