class K {
    void pro() {
        System.out.println("Hello");
    }

    K() {
        System.out.println("Hello");
    }
}

//Error: Main method not found in class K, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application