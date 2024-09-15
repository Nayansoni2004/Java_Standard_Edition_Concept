class B {
    //static initialization block
    static {
        System.out.println("A");
    }
    //main method 
    public static void main(String[] args) {
        B x = new B();

        B y = new B();

        B z = new B();
    }
}
/* happily compiled...
OUTPUT: A
static initialization block sirf 1 bar run hote h,jub class load hoti h,isley object bhale hi kitni hi bar bana 
k constructor ko call kia jaye,pr static initialization block sirf 1 bar class load hone k time pr load ho jate h
,or initialization blocks ko bhi stack m frame memory allocate hoti h.
*/