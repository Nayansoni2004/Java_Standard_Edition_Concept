class G {

    G(int w) {

    }

    //main method
    public static void main(String[] args) {
        G x = new G();

        System.out.println(x);
    }
}
/* G.java:9: error: constructor G in class G cannot be applied to given types;
        G x = new G();
              ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error 
error aai kyuki programmer supplied constructor m programmer ne paramater pas kia h,or constructor
call krte waqt us me koi int value pas nhi ki,jo ki mandatory/required h,isley error aai...
*/