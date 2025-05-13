class Q {
    public static void main(String[] args) {
        int[][] x = new int[2][]; //created 2d array of size 2 and 1d arrays with no size..

        for(int i = 0 ; i < x.length ; i++) {
            System.out.println(x[i]); //accessing inner 1d array objects..
        }
    }
}
/* OUTPUT: created 2d array of size 2 but didn't initialized at the time of declaration & instantiation, so at each
           1d array references are not initialized like [@ds445nds this so printing the inner object ref. code 
           give null values.
PS D:\github_repos\javapractice\24_arrays> java Q
null
null
 */