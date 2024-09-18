import java.io.FileReader;
import java.io.FileNotFoundException;

class O1 {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
          //  FileReader r = new FileReader("abc.txt"); uncomment kr k run krna h,then comment kr k run krna h!

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(3);
    }    
}
/*OUTPUT: agar abc.txt file exists krti h to ye output aayega...
D:\javaprac\33_Exception_Handling>java O1
1
2
3
 */
/*OUTPUT: agar abc.txt file exists nhi krti h to ye output aayega...
D:\javaprac\33_Exception_Handling>java O1
1
2
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at java.base/java.io.FileReader.<init>(FileReader.java:60)
        at O1.main(O1.java:11)
3
 */