class W1 {
    //over-ridden method version
    static void pro() {
        System.out.println("pro in parent!!!");
    }
}

class M1 extends W1 {
    //over-riding method version
    static void pro() {
        System.out.println("pro in child~~~~");
    }
    //main method
    public static void main(String[] args) {
        pro(); //static method ko main method m direct call kr sakte h,legla h!
        
        //super.pro(); //parent ka method version run hoga!lekin super instance-level keyword h to static block m 
                     //nhi likh sakte!!!  
        W1.pro(); //(classname dot membername)
    }
}
/* OUTPUT: pro in child~~~~
           pro in parent!!!
kyuki main method static block h isley uske andar super keyword applicable nhi h,isley parent class k static 
member ko classname dot membername likh k call kr lenge. */