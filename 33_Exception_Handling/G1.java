import java.io.FileReader;
import java.io.FileNotFoundException;

class G1 {
    G1() throws FileNotFoundException {

        FileReader r = new FileReader("abc.txt");

    }
}
/*OUTPUT: happily compiled but run nhi hoga bec. main method not found in the class G1..
compile isley ho gya kyuki hum ne exception ko declare kia h....jo ki rule kehta h either 
handle or declare....
 */