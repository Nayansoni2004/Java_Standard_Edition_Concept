class M1{
    //method definition - ok
    void process() {

    }

    //method call statement - NOT OK
    //process();

    void abc() {
        process();
    }

    M1() {
        process();
    }
}

//Error: Main method not found in class M1, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application