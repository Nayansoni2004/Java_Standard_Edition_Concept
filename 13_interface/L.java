interface X1 {
    int w = 92;
}

class L {
    public static void main(String[] args) {
        System.out.println(X1.w);
    }
}
/*
 * interface variables are implicitly static
 * output: 92
 */