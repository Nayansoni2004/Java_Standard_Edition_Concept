class O {
    final void pro() {
        System.out.println("Hiiiiii");
    }
}

class K {

    //main method 
    public static void main(String[] args) {

        O o = new O();

        o.pro();
    }
}
/* OUTPUT: Hiiiiii
class name class context create krta h or O class m instance level(non-static)members h,or instance level members
ko class context m direct access nhi kr sakte,illegal h,isley K class m O class ka instance bana k O class k 
members ko access kr lenge,,,O class m method final marked h isley K class m final method ko access to kr sakte 
h but final method m kisi bhi prakar ka modification nhi kr sakte,java allowed nhi krta h. 
*/