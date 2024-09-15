class M1 {
    //static initialization block
    static {
        System.out.println("E");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("A");
    }
    //static initialization block
    static {
        System.out.println("W");
    }
}
/* OUTPUT: E W A
M1 class load hogi or load hote hi classObject banega or turant static initialization blocks us classObject pr 
automatic run ho jayenge,then main method se execution resume hoga or main method ko stack m frame memory 
allocate hogi or kyuki main method static h,isley main method bhi us classObject pe register ho jayegi then
main method ka code run hoga or "A" at the last print hoga. */ 
