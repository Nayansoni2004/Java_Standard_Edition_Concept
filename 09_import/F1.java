//import statement
import java.util.Date;

class F1 {

    //main method 
    public static void main(String[] args) {

        Date x;

        File y;

        Format z;
    }
}
/* F1.java:11: error: cannot find symbol
        File y;
        ^
  symbol:   class File
  location: class F1
F1.java:13: error: cannot find symbol
        Format z;
        ^
  symbol:   class Format
  location: class F1
2 errors */

/* 2 errors aai kyuki import java.util.Date; likhne se Date class java library k andar se import ho gyi or access v
ho jayegi F1 class k andar but File or Format classes import nhi hui isley 2 errors aai */