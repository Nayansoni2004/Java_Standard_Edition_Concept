class B {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(String str : args) {
            System.out.print(str + " ");
        }

    }
}
/*
PS D:\github_repos\javapractice\25_arrays> javac B.java
PS D:\github_repos\javapractice\25_arrays> java B mohan saxena vijay deenanath chouhan prithviraj raso
7
mohan saxena vijay deenanath chouhan prithviraj raso 

PS D:\github_repos\javapractice\25_arrays> java B "mohan saxena" "vijay deenanath chouhan" "prithviraj raso"
3
mohan saxena vijay deenanath chouhan prithviraj raso 

PS D:\github_repos\javapractice\25_arrays> java B "mohan saxena" "vijay deenanath chouhan" 'prithviraj raso'
3 <-here length is 3 bec. 'prithviraj raso' is treated as a group of words in terminal before java program sees it################
mohan saxena vijay deenanath chouhan prithviraj raso
 */