class J {
    int y;

    void pro() {
        y = 100;
    }

    J() {
        y = 60;
    }
}

//Error: Main method not found in class J, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application