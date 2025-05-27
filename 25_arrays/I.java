class I {
    public static void main(String[] args) {
        String[][] tuDArr = {new String[0], new String[3], new String[2]};//super shortcut technique 
        
        //for-each loop
        for(String[] VnDArr : tuDArr) {
            for(String str : VnDArr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
// If an array has size zero, it means there are no elements in it. So, when using a loop to access its elements, the program detects that the length is zero and does not enter the loop.

/*OUTPUT
PS D:\github_repos\javapractice\25_arrays> java I
               <-blank line bec. there is no element is first 1d array so inner loop doesn't enter & hence prints a blank line that is System.out.println();
null null null 
null null 
 */