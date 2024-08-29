class D {
    public static void main(String[] args) {
        abc();
    }

    static void abc() {
        bcd();
    }

    static void bcd() {
        cde();
    }

    static void cde() {
        System.out.println("A");
    }
    
}

//D:\javaprac\2_code_execution>javac D.java

//D:\javaprac\2_code_execution>java D
//A