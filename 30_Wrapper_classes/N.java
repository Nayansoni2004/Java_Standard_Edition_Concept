class N {
    //main method
    public static void main(String[] args) {
        Character b1 = 127;
        Character b2 = 127;

        System.out.println(b1 == b2);
    }    
}
/*OUTPUT:true 
true aaya kyuki object sirf 1 bar banega constant pool memory m or usi ka ref. code b2 object ref. var. m bhi
assign ho jayega value out of range nhi h kyuki ye wrapper class Character h,primitive nhi h,primitive hota to
value out of range hoti,or chote bartan ko bade bartan m rakh sakte h isley bhi legal h. 
*/