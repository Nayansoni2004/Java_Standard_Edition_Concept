class A1 {
    static int i;
    static int j;
    static int k;
    //main method
    public static void main(String[] args) {
        aaa();
      // System.out.println(i);
      // System.out.println(j);
      // System.out.println(k);
    }

    static void aaa() {
        bbb();
        for(i=0 ; i<30 ; i++) {
            System.out.println("aaa()" + i);
        }
    }

    static void bbb() {
        if(k == 10) {
            for(j=0 ; j<30 ; j++) {
                System.out.println("bbb()" + j);
            }
        } else {
            ccc();
        }
        
    }

    static void ccc() {
        for(k=0 ; k<30 ; k++) {
            if(k == 10) {
                bbb();
            } else {
            System.out.println("ccc()" + k);
            }
        } 
    } 
}