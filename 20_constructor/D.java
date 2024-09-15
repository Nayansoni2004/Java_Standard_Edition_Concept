class D {
    //main method 
    public static void main(String[] args) {

        D x = new D(12);
        //D x = new D(); //uncomment one statement at a time and run..

        System.out.println(x); 

    }
}
/* D.java:5: error: constructor D in class D cannot be applied to given types;
        D x = new D(12);
              ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error
error ko aache se padhna h is ex. m or error aai kyuki class m constructor humne nhi banaya h,compiler supplied
default constructor bana mila h,or default constructor ki parameter body empty hoti h,usme hum parameter pass 
nhi kr sakte...so ,DEFAULT CONSTRUCTOR CAN NOT BE PARAMETERIZED.
*/