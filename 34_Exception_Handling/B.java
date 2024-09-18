class B {
    //main method
    public static void main(String[] args) {

        if(args.length == 0) {
            try {
                throw new MissingCommandLineArgumentException();
            }
            catch(MissingCommandLineArgumentException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(args[0]);
        }

    }
}

class MissingCommandLineArgumentException extends Exception {
    
}

/*OUTPUT:
D:\javaprac\34_Exception_Handling>javac B.java

D:\javaprac\34_Exception_Handling>java B
MissingCommandLineArgumentException
        at B.main(B.java:7)

D:\javaprac\34_Exception_Handling>java B mohan
mohan
 */