class E {
    public static void main(String[] args) {
        abc();
        System.out.println("A");
    }

    static void abc() {
        bcd();
        System.out.println("B");
    }

    static void bcd() {
        cde();
        System.out.println("E");
    }

    static void cde() {
        System.out.println("Z");
    }
}

//D:\javaprac\2_code_execution>javac E.java
//
//D:\javaprac\2_code_execution>java E
//Z
//E
//B
//A