class P {
    //main method
    public static void main(String[] args) {
        Short b1 = 127;
        Short b2 = 127;
        
        System.out.println(b1 == b2);
    }    
}
/*OUTPUT:true
true output aaya kyuki chote bartan byte ko bade bartan short m rakh sakte h or byte ki range -128 to 127 hoti h
to short ki range jada hoti h,rakh sakte h,or even though conversion then boxing allowed nhi h but is special
case m conversion then boxing allowed h,to pahle conversion hoga then boxing hogi.*/