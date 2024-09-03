class F1 {
    //main method...
    public static void main(String[] args) {
        System.out.println(F1.w);
    }
}

class T {
    static boolean w = true;
}
//error aai kyuki w dusri class ka variable h or F1 usko F1 class m 
//dhund rha h usko batana padega ki w class T ka member h. 
//F1.java:4: error: cannot find symbol
//        System.out.println(F1.w);
//                             ^
//  symbol:   variable w
//  location: class F1
//1 error