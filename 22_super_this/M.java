class W1 {
    //over-ridden method version
    static void pro() {
        System.out.println("pro in parent!!!");
    }
}

class M extends W1 {
    //over-riding method version
    static void pro() {
        System.out.println("pro in child~~~~");
    }
    //main method
    public static void main(String[] args) {
        pro(); //static method ko main method m direct call kr sakte h,legla h!
        
        super.pro(); //parent ka method version run hoga!lekin super instance-level keyword h to static block m 
                     //nhi likh sakte!!!  
    }
}
/* M.java:17: error: non-static variable super cannot be referenced from a static context
        super.pro(); //parent ka method version run hoga!
        ^
1 error
error aai kyuki super instance level keyword h or static context/block/method m super applicable nhi h. */