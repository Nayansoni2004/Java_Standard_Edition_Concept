class C {
    //main method
    public static void main(String[] args) {

        if(args.length == 0) {
            try {
                throw new NoCommandLineArgumentException("Command Line Argument is missing...Sorry!");
            } catch(NoCommandLineArgumentException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(args[0]);
        }

    }
}

class NoCommandLineArgumentException extends Exception {
    NoCommandLineArgumentException() {

    }

    NoCommandLineArgumentException(String message) {
        super(message);
    }
}
/*OUTPUT: two constructors isley banaye kyuki Exception aayega to cmd pr us Exception ka message bhi print ho
ki Exception aa kya rha h? ye jan ne k liye two constructors banana padte h,compulsary h.

D:\javaprac\34_Exception_Handling>javac C.java

D:\javaprac\34_Exception_Handling>java C
NoCommandLineArgumentException: Command Line Argument is missing...Sorry!
        at C.main(C.java:7)

D:\javaprac\34_Exception_Handling>java C mohan
mohan
 */